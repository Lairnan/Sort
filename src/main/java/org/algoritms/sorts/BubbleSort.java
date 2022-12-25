package org.algoritms.sorts;

import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.List;

@UtilityClass
public class BubbleSort {
    public List<Integer> bubbleSort(Integer[] coll) {
        int length = coll.length;
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length - 1; j++) {
                if(coll[j] > coll[j + 1]) {
                    coll[j] = coll[j] + coll[j + 1];
                    coll[j + 1] = coll[j] - coll[j + 1];
                    coll[j] = coll[j] - coll[j + 1];
                }
            }
        }

        return Arrays.stream(coll).toList();
    }
}
