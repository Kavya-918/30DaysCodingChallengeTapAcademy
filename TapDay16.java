/* 🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 16 🚀

Question:
Write a program to count the number of unique elements in an ascending sorted array.

Example:
Input:
8
1 2 3 3 4 4 4 5
Output: 3

Your Task:

Develop a program to count the number of unique elements in the given ascending sorted array.*/

import java.util.Scanner;

public class TapDay16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int s = sc.nextInt();
        System.out.print("Enter Elements: ");
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        int res = countUniques(arr);
        System.out.print(res);
        sc.close();
    }

    public static int countUniques(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int uniqueCount = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if ((i == 0 || arr[i] != arr[i - 1]) && (i == n - 1 || arr[i] != arr[i + 1])) {
                uniqueCount++;
            }
        }

        return uniqueCount;
    }
}
