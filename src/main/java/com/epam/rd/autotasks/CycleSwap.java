package com.epam.rd.autotasks;

import java.util.Scanner;

class CycleSwap {
    static void cycleSwap(int[] array) {
        int swap;
        if (array.length !=0) {
            swap = array[array.length - 1];
            System.arraycopy(array, 0, array, 1, array.length - 1);
            array[0] = swap;
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if (array.length != 0) {
            int[] swap = new int[shift];
            System.arraycopy(array, array.length - shift, swap, 0, shift);
            System.arraycopy(array, 0, array, shift, array.length - shift);
            System.arraycopy(swap, 0, array, 0, shift);
        }
    }


}
