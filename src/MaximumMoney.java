// https://practice.geeksforgeeks.org/problems/maximum-money/0

// Maximum money

// Given street of houses (a row of houses), each house having some amount of money kept inside; now there is a thief who is going to steal this money but he has a constraint/rule that he cannot steal/rob two adjacent houses. Find the maximum money he can rob.

import java.util.*;
import java.lang.*;
import java.io.*;

public class MaximumMoney {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++){
            int house = scan.nextInt();
            int money = scan.nextInt();

            double steal = (double) house / 2;
            int ans = (int)  steal;
            if (steal > ans){
                ans = ans + 1;
            }
            System.out.println(ans * money);
        }
    }

}
