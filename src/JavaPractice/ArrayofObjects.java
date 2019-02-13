package JavaPractice;

import java.lang.*;

// Java program to illustrate creating an array of objects

// Creating an object
class Student
{
    public int test_grade;
    public String name;
    Student(int test_grade, String name)
    {
        this.test_grade = test_grade;
        this.name = name;
    }
}

// Elements of array are objects of a class Student.
public class ArrayofObjects
{
    public static void main (String[] args)
    {
        // declares an Array of integers.
        Student[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new Student[5];

        // initialize the first elements of the array
        arr[0] = new Student(80,"Cori");

        // initialize the second elements of the array
        arr[1] = new Student(90,"Mark");

        // so on...
        arr[2] = new Student(95,"Amad");
        arr[3] = new Student(75,"Budjar");
        arr[4] = new Student(35,"Boris");

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++){
            System.out.println("Element at " + i + ": " +  arr[i].test_grade +" - "+ arr[i].name);
        }
    }
}

