/* 🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 27 🚀

Question:
Write a program to convert a given string by inserting an asterisk (*) before every 'a' in the string and print the modified string.

Example:
Input:
banana
Output:
b*an*an*a

Your Task:

Develop a program in your preferred programming language to convert the given string as described and print the modified string.*/
import java.util.Scanner;

public class TapDay27{

 public static String insertAsteriskBeforeA(String input) {
 return input.replace("a", "*a");
 }

 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a string: ");
 String input = scanner.nextLine();
 String result = insertAsteriskBeforeA(input);
 System.out.println(result);
 }
}
