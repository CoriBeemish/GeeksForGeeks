// FILE: Replace0With5.java

// Replace all 0's with 5
// https://practice.geeksforgeeks.org/problems/replace-all-0-with-5-in-an-input-integer/1

// Given a number N. The task is to complete the function convertFive() which replace all zeros in the number with 5
// and returns the number.

// Input:
// The first line of input contains an integer T, denoting the number of testcases. Then T testcases follow. Each
// testcase contains a single integer N denoting the number.

// Output:
// The function will return integer where all zero's are converted to 5.

// User Task:
// Since this is a functional problem you don't have to worry about input, you just have to complete the function
// convertFive().

import java.util.*;

class Replace{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            GfG2 g=new GfG2();
            g.convertFive(n);
        }
    }
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below*/
class GfG {
    public static void convertFive(int n){
        //add code here.
        String str = Integer.toString(n);
        str = str.replaceAll("0", "5");
        System.out.println(str);
    }
}