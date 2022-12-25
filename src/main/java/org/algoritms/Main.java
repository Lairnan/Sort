package org.algoritms;

import lombok.experimental.ExtensionMethod;
import org.algoritms.sorts.BubbleSort;

import java.util.Arrays;
import java.util.Random;

@ExtensionMethod(BubbleSort.class)
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        checkBubbleSort(random);

    }

    private static Integer[] generate(Random random, Integer arrayLength){
        Integer[] array = new Integer[arrayLength];
        for(int i = 0; i < arrayLength; i++){
            array[i] = random.nextInt(0,1500);
        }

        return array;
    }

    private static void checkBubbleSort(Random random) {
        Integer[] array = generate(random, random.nextInt(15, 50));
        System.out.println(Arrays.stream(array).toList());

        long startTime = System.nanoTime();
        System.out.println(array.bubbleSort());
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Время выполнения: " + (duration / 100d) + "мс.");
    }
}