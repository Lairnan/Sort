package org.algoritms;

import org.algoritms.sorts.BubbleSort;

import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] array = generate(random, random.nextInt(15, 50));
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
        long startTime = System.nanoTime();
        System.out.println(BubbleSort.bubbleSort(array));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Время выполнения: " + (duration / 100d) + "мс.");
    }
}