package org.algoritms;

import org.algoritms.sorts.BubbleSort;
import org.algoritms.sorts.ShakerSort;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
    public static void changePosition(List<Integer> array, int i) {
        if(array.get(i) > array.get(i + 1)) {
            array.set(i, array.get(i) + array.get(i + 1));
            array.set(i + 1, array.get(i) - array.get(i + 1));
            array.set(i, array.get(i) - array.get(i + 1));
        }
    }
    public static boolean changePosition(List<Integer> array, int i, boolean isMoved) {
        if(array.get(i) > array.get(i + 1)) {
            array.set(i, array.get(i) + array.get(i + 1));
            array.set(i + 1, array.get(i) - array.get(i + 1));
            array.set(i, array.get(i) - array.get(i + 1));
            return true;
        }
        return isMoved;
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(() -> checkBubbleSort(generate()));
        executorService.execute(() -> checkShakerSort(generate()));

        executorService.shutdown();
    }

    private static List<Integer> generate(){
        int arrayLength = 1500;
        Random random = new Random();
        List<Integer> array = new ArrayList<>();
        for(int i = 0; i < arrayLength; i++){
            array.add(random.nextInt(0,9999999));
        }

        return array;
    }

    private static void checkBubbleSort(List<Integer> array) {
        System.out.println("Поток " + Thread.currentThread().getName() + ": " + array);
        Instant startTime = Instant.now();
        System.out.println("Поток " + Thread.currentThread().getName() + ": " + BubbleSort.bubbleSort(array));
        Instant endTime = Instant.now();
        Duration duration = Duration.between(startTime,endTime);
        System.out.println("Поток " + Thread.currentThread().getName() + ": " + "Время выполнения пузырьчатой сортировки: " + duration.toMillis() + "мс.");
    }

    private static void checkShakerSort(List<Integer> array) {
        System.out.println("Поток " + Thread.currentThread().getName() + ": " + array);
        Instant startTime = Instant.now();
        System.out.println("Поток " + Thread.currentThread().getName() + ": " + ShakerSort.shakerSort(array));
        Instant endTime = Instant.now();
        Duration duration = Duration.between(startTime,endTime);
        System.out.println("Поток " + Thread.currentThread().getName() + ": " + "Время выполнения шейкерной сортировки: " + duration.toMillis() + "мс.");
    }
}