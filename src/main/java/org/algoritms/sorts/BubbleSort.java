package org.algoritms.sorts;

import org.algoritms.Main;
import java.util.List;

public class BubbleSort {
    public static List<Integer> bubbleSort(List<Integer> array) {
        int length = array.size();
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length - 1; j++) {
                Main.changePosition(array, j);
            }
        }

        return array;
    }
}