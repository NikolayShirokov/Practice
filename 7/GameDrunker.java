package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class GameDrunker {
    int run = 0;

    public void inputData(ArrayDeque<Integer> arr, Scanner s) {
        for (int i = 0; i < 5; i++)
            arr.add(s.nextInt());
    }

    public void outputData(ArrayDeque<Integer> arr) {
        System.out.print(arr + "\n");
    }

    public void checkCards(ArrayDeque<Integer> arr1, ArrayDeque<Integer> arr2, int c1, int c2) {
        c1 = arr1.getFirst();
        c2 = arr2.getFirst();

        if ((c1 > c2) && (c1 != 0 && c2 != 0)) {
            arr1.removeFirst();
            arr1.add(c1);
            arr1.add(c2);
            arr2.removeFirst();
        }
        else if ((c1 < c2) && (c1 != 0 && c2 != 0)){
            arr2.removeFirst();
            arr2.add(c2);
            arr2.add(c1);
            arr1.removeFirst();
        }
        else if (c1 == 0 && c2 == 9) {
            arr1.removeFirst();
            arr1.add(c1);
            arr1.add(c2);
            arr2.removeFirst();
        }
        else if (c1 == 9 && c2 == 0) {
            arr2.removeFirst();
            arr2.add(c2);
            arr2.add(c1);
            arr1.removeFirst();
        }
        this.run += 1;

    }

    public int getRun() {
        return run;
    }
}
