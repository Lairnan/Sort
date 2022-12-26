package org.algoritms.sorts;

import java.util.List;

public class BubbleSort {
    public static List<Integer> bubbleSort(List<Integer> array) {
        int length = array.size();
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length - 1; j++) {
                if(array.get(j) > array.get(j + 1)) {
                    array.set(j, array.get(j) + array.get(j + 1));
                    array.set(j + 1, array.get(j) - array.get(j + 1));
                    array.set(j, array.get(j) - array.get(j + 1));
                }
            }
        }

        return array;
    }
}