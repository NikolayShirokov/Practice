package com.company;

import java.util.Random;
import java.util.Scanner;

public class StudentTest {
    static Student[] arr = new Student[5];

    public static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];

        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l+r)/2;
            sort(arr, l, m);
            sort(arr , m+1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int[] iDNumber = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student(s.nextLine(), r.nextInt(100));
            iDNumber[i] = arr[i].getId();
        }

        for (int el : iDNumber) {
            System.out.print(el + " ");
        }

        System.out.println();
        sort(iDNumber, 0, iDNumber.length - 1);

        for (int el : iDNumber) {
            System.out.print(el + " ");
        }
    }
}
