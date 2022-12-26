package org.algoritms.sorts;

import org.algoritms.Main;

import java.util.List;

public class ShakerSort {
    public static List<Integer> shakerSort(List<Integer> array) {
        int length = array.size();
        int begin = 0;
        int end = length - 1;
        boolean isMoved = true;
        while(isMoved) {
            isMoved = false;
            for(int i = begin; i < end; i++) {
                isMoved = Main.changePosition(array, i, isMoved);
            }
            if(!isMoved) break;
            end--;
            for(int i = end; i >= begin; i--) {
                isMoved = Main.changePosition(array, i, isMoved);
            }
            begin++;
        }

        return array;
    }
}
