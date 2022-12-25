package org.algoritms.sorts;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static List<Integer> bubbleSort(Integer[] array) {
        int length = array.length;
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length - 1; j++) {
                if(array[j] > array[j + 1]) {
                    array[j] = array[j] + array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                }
            }
        }

        return Arrays.stream(array).toList();
    }
}