// https://practice.geeksforgeeks.org/problems/java-delete-alternate-characters/0/?ref=self

// Java Delete alternate characters

// Given a string S as input. Delete the characters at odd indices of the string.

import java.util.*;
import java.lang.*;
import java.io.*;

public class Java_DeleteAlternateCharacters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t > 0){

            String s = scan.next();
            int n = s.length();
            StringBuilder s1 = new StringBuilder();

            for (int i=0; i<n; i+=2){
                s1.append(s.charAt(i));
            }

            System.out.println(s1);
            t--;
        }
    }

}
