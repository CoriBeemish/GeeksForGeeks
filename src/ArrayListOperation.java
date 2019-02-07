// ArrayListOperation.java

// https://practice.geeksforgeeks.org/problems/arraylist-operation/1

// ArrayList Operation

// Given an ArrayList of N lowercase characters. The task is to count frequency of elements in the list.

// Note: use add() to append element in the list and contains() to check an element is present or not in the list and
// collections.frequency() to find the frequency of the element in the list.

// Input Format:
// First line of testcase contains T, number of testcases. For each testcase, first line contains number of queries
// Q. Each query may be any one of the two type:
// 1. "i" with "c" : insert the element "c" into the ArrayList
// 2. "f" with "c": find the frequency of "c" in the ArrayList.

// Output Format:
// For each testcase, output the frequency of elements. Print "Not Present" if element is not present in the list else
// its frequency in new line for every query.

// Your Task:
// Your task is to complete the functions insert() and freq() which are used to insert and find frequency of element
// respectively.


//Initial Template for Java
import java.util.*;

//Position this line where user code will be pasted.
// Driver class with driver code
class GFG {
    // Driver code
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            // Declaring ArrayList
            ArrayList<Character> clist = new ArrayList<Character>();

            int q = sc.nextInt();

            // Looping for queries
            while(q-- > 0)
            {
                char ch = sc.next().charAt(0);
                Geeks obj = new Geeks();

                if(ch == 'i')
                {
                    char c = sc.next().charAt(0);
                    obj.insert(clist, c);
                }

                if(ch == 'f')
                {
                    char c = sc.next().charAt(0);
                    obj.freq(clist, c);
                }
            }
        }
    }
}


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
// Geeks class with functions insert and freq
// insert : to insert element into ArrayList
// freq : function to count frequency of element
class Geeks
{
    // Function to insert element
    public static void insert(ArrayList<Character> clist, char c)
    {
        //add c to clist
        clist.add(c);
    }

    // Function to count frequency of element
    public static void freq(ArrayList<Character> clist, char c)
    {

        if(clist.contains(c))
            System.out.println(Collections.frequency(clist, c));
        else
            System.out.println("Not Present");

    }
}

