/*
🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 26 🚀

Question:
Write a program to count the number of alphanumeric characters in a given string.

Example:
Input:
#$Hello123?&
Output: 8

Your Task:

Develop a program to count the number of alphanumeric characters in the given string. */
import java.util.Scanner;

public class TapDay26 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.println("Enter a string: ");
 String input = scanner.nextLine();

 int count = countAlphanumericCharacters(input);
 System.out.println("Number of alphanumeric characters: " + count);
 }

 public static int countAlphanumericCharacters(String str) {
 int count = 0;
 for (int i = 0; i < str.length(); i++) {
 char c = str.charAt(i);
 if (Character.isLetterOrDigit(c)) {
 count++;
 }
 }
 return count;
 }
}
