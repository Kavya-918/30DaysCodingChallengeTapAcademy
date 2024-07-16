/* 🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 18 🚀
Question:
Write a program that prints all pairs of integers from a given array whose sum is even.
Example:
Input:
5
1 2 3 4 5
Output:
1 3
1 5
2 4
3 5
Your Task:
Develop a program to print all pairs whose sum is even from the given array.*/
import java.util.Scanner;
public class TapDay18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size of an Array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[i] + arr[j]) % 2 == 0) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }

        scanner.close();
    }
}
