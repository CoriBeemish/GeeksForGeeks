// https://practice.geeksforgeeks.org/problems/palindrome-string/0

// Given a string S, check if it is palindrome or not.

// Input:
// The first line contains 'T' denoting the number of test cases. T testcases follow. Each testcase contains two lines
// of input. The first line contains the length of the string and the second line contains the string S.

//Output:
//For each testcase, in a new line, print "Yes" if it is a palindrome else "No". (Without the double quotes)

import java.util.*;
import java.lang.*;
import java.io.*;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner  scanner= new Scanner(System.in);
        int test = scanner.nextInt();

        for(int i=0; i < test; i++) {
            int n = scanner.nextInt();
            String str=scanner.next().toLowerCase();

            StringBuilder rev = new StringBuilder(str);

            rev = rev.reverse();

            if(str.equals(rev.toString())){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
