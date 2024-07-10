/*
🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 12 🚀

Question:
Write a program that prints the absolute sum of all elements present in a given array of integers.

Example:
Input:
6
1 -4 -6 3 10 -20
Output: 44

Your Task:

Develop a program to print the absolute sum of all elements present in the given array.*/
import java.util.Scanner;

public class TapDay12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of an array:");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            sum += Math.abs(element);
        }
        System.out.println(sum);
    }
}

    

