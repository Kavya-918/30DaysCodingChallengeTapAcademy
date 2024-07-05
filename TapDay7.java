/*🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 07 🚀
Question:
Write a program that prints all the multiples of n up to x.
Example:
Input: 5 30
Output: 5 10 15 20 25 30
Your Task:
Develop a program to print all the multiples of n up to x.*/
import java.util.Scanner;

public class TapDay7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        System.out.print("Enter the value of x:");
        int x = sc.nextInt();
        System.out.println("Multiples of " + n + " up to " + x + ":");
        for (int i = n; i <= x; i += n) {
            System.out.print(i + " ");
        }
    }
}
