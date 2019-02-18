package JavaPractice.Arrays;

import java.util.*;
import java.lang.*;
import java.io.*;

public class AccessingArrayLoop {

    public static void main(String[] args) {
        // declares an Array of integers.
        int[] arr = new int[] {5, 10, 20, 30, 40, 50};

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++){
            System.out.println("Element at index " + i + " : "+ arr[i]);
        }
    }

}
