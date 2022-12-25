package org.algoritms;

import org.algoritms.sorts.BubbleSort;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] array = generate(random, random.nextInt(500, 1500));
        System.out.println(Arrays.stream(array).toList());
        checkBubbleSort(array);
    }

    private static Integer[] generate(Random random, Integer arrayLength){
        Integer[] array = new Integer[arrayLength];
        for(int i = 0; i < arrayLength; i++){
            array[i] = random.nextInt(0,1500);
        }

        return array;
    }

    private static void checkBubbleSort(Integer[] array) {
        Instant startTime = Instant.now();
        System.out.println(BubbleSort.bubbleSort(array));
        Instant endTime = Instant.now();
        Duration duration = Duration.between(startTime,endTime);
        System.out.println("Время выполнения: " + duration.toMillis() + "мс.");
    }
}