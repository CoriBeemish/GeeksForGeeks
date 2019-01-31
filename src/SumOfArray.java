// https://practice.geeksforgeeks.org/problems/sum-of-array/0

// Given an integer array A[] of size N. The task is to find sum of it.

// Does not work in GeeksForGeeks, but it should

import java.util.*;
import java.lang.*;
import java.io.*;

public class SumOfArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        while (testCases > 0) {
            int sum = 0;
            int n = scan.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i < n; i++) {

                arr[i] = scan.nextInt();
                sum = sum + arr[i];
            }
            System.out.println(sum);

            testCases--;
        }

    }
}
