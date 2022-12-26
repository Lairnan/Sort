package org.algoritms;

import org.algoritms.sorts.BubbleSort;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(() -> checkBubbleSort(generate()));

        executorService.shutdown();
    }

    private static List<Integer> generate(){
        int arrayLength = 1500;
        Random random = new Random();
        List<Integer> array = new ArrayList<>();
        for(int i = 0; i < arrayLength; i++){
            array.add(random.nextInt(0,1500));
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
}