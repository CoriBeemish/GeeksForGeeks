// OperationsOnArrayList.java

// Operations on ArrayList
// https://practice.geeksforgeeks.org/problems/operations-on-arraylist

// Given an arraylist of integers. The task is to perform operations on ArrayList according to the queries and print
// output for the required queries.

// Note: use Collections.sort() to sort the list in natural order, Collections.reverseOrder() to arrange the elements
// in reverse, get() to return the element at index of the list, binarySearch() to find the index of the specified
// element in the list.

// Input Format:
// First line of input contains number of testcase T. For each testcase, first line of input contains Q, number of
// queries. Next line contains Q queries as:
//    1. a x : inserts the element x at the end of the list.
//    2. i : arrange the list in increasing order.
//    3. d : arrange the list in decreasing order.
//    4. s y : search for the element y in the list and prints the first-index(for duplicate) (0-based indexing) of
//       that in the list. -1 if not found.

// Output Format:
// For each testcase, print the output according to the queries.

// Your Task:
// Your task is to complete the functions insert(), IncOrder(), Search() and DecOrder() such that driver code will be
// able to perform required queries.



/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

import java.util.*;

//User function Template for Java
// Helper class to handle functions insert(),
// IncOrder(), Search() and DecOrder()

class OperationsOnArrayList {
    // Function to insert element into list
    public static void insert(ArrayList<Integer> list, int x)
    {
        // Your code here
        list.add(x);
    }

    // Function to sort list in Increasing order
    public static void IncOrder(ArrayList<Integer> list)
    {
        // Your code here
        Collections.sort(list);
    }

    // Function to search element in the lise
    // val : element to be searched
    public static void Search(ArrayList<Integer> list, int val)
    {
        int flag = -1;
        /*
        Your Code here
         * */
        int index = Collections.binarySearch(list, val);

        if(index>=0){
            flag=0;
        }
        if(flag == -1){
            System.out.println("-1");
        }
        else{
            System.out.println(index-1);
        }

    }

    // Function to sort list in decreasing order
    public static void DecOrder(ArrayList<Integer> list)
    {
        // Your code here
        Collections.sort(list,Collections.reverseOrder());
    }
}
