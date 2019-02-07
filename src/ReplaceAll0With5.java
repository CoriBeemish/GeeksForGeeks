// FILE: ReplaceAll0With5.java
// DATE: February 6th, 2019

// Replace all 0's with 5
// https://practice.geeksforgeeks.org/problems/replace-all-0s-with-5/1/?ref=self

// You are given an integer n. You need to convert all zeroes of n to 5.

// Input Format:
// The first line of input contains an integer T denoting the number of test cases . Then T test cases follow . Each
// test case contains a single integer n denoting the number.

// Output Format:
// The output of the function will be an integer where all zero's are converted to 5 .

// Your Task:
// Your task is to complete the function convertFive which takes an integer n as argument and replaces all zeros in
// the number n with 5 .Your function should return the converted number .


import java.util.Scanner;

class Convert_To_Five
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int N = sc.nextInt();
            System.out.println(new GfG2().convertFive(N));
            T--;
        }

    }
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class GfG2
{
    int convertFive(int num) {
        // Your code here
        String str = String.valueOf(num);
        str = str.replace("0","5");
        return Integer.parseInt(str);
    }
}
