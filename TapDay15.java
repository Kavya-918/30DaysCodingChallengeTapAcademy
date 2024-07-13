/* 🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 15 🚀

Question:
Write a program that prints the maximum product of pairs present in a given array of integers.

Example:
Input:
8
-2 6 5 -4 7 -8 9 3
Output: 63

Your Task:

Develop a program to print the maximum product of pairs present in the given array.*/
import java.util.Arrays;
import java.util.Scanner;

public class TapDay15 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.print("Enter the elements: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    if (n < 2) {
      System.out.println("No pairs possible");
      return;
    }
    Arrays.sort(arr);
    int maxProduct = Math.max(arr[n - 1] * arr[n - 2], arr[0] * arr[1]);

    System.out.println("Maximum product: " + maxProduct);
}
}
