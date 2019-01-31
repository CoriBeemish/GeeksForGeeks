// https://practice.geeksforgeeks.org/problems/java-inputoutput/0

// Java Input/Output
// Given a string S and an integer number N, print the output in the form : "The input string :S" and "The input integer :N" in new line.

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t > 0) {

            String s = scan.next();  // This is the error, but no one knows why it doesn't work
            int n = scan.nextInt();

            System.out.println("The input string :" + s);
            System.out.println("The input integer :" + n);

            t--;
        }

    }
}