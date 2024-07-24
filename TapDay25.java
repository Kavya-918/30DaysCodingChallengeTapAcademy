/*
🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 25 🚀

Question:
Write a program that reverses the second half of a given string.

Example:
Input:
Programming
Output:
Progrgnimma

Your Task:

Develop a program to reverse the second half of the given string.*/
Aspiring Software Engineer | Seeking Job for Software Engineer | Java, HTML & CSS, Javascript, Python, Database
1w
import java.util.Scanner;

public class TapDay25{

 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a string: ");
 String input = scanner.nextLine();
 String result = reverseSecondHalf(input);
 System.out.println(result);
 }

 public static String reverseSecondHalf(String str) {
 int length = str.length();
 int mid = length / 2;
 String firstHalf = str.substring(0, mid);
 String secondHalf = str.substring(mid);
 String reversedSecondHalf = new StringBuilder(secondHalf).reverse().toString();
 return firstHalf + reversedSecondHalf;
 }
}
