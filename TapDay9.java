/*
🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 09 🚀
Question:
Write a program to count the number of even digits present in a given integer value n.
Example:
Input: 25436
Output: 3
Your Task:
Develop a program to count the number of even digits present in the given integer n.*/
import java.util.Scanner;

public class TapDay9 {
    public static int countEvenDigits(int n) {
        int evenCount = 0;
        // Handle negative numbers by taking the absolute value
        n = Math.abs(n);
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                evenCount++;
            }
            n = n / 10;
        }

        return evenCount;
    }

    public static void main(String[] args) {
        // int inputValue = 25436;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter inputvalue:");
        int inputValue = sc.nextInt();
        int output = countEvenDigits(inputValue);
        System.out.println("Output: " + output);
    }
}
