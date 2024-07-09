/*
🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 11 🚀
Question:
Write a program that prints the index of the smallest element present in a given array of integers.
Example:
Input:
5
5 6 4 8 9
Output: 2
Your Task:
Develop a program to print the index of the smallest element present in the given array */
import java.util.Scanner;

public class TapDay11 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("The index of the smallest element is: " + minIndex);
    }
}

