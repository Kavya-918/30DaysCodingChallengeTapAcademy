/* 🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 28 🚀

Question:
Write a program that checks whether two strings are equal without using any inbuilt methods.

Example:
String 1: ""hello""
String 2: ""hello""
Output: Equal

Your Task:
Develop a program to check whether two strings are equal without using any inbuilt methods,*/
import java.util.Scanner;

public class TapDay28 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.println("Enter the first string:");
 String str1 = scanner.nextLine();

 System.out.println("Enter the second string:");
 String str2 = scanner.nextLine();

 if (areStringsEqual(str1, str2)) {
 System.out.println("Equal");
 } else {
 System.out.println("Not Equal");
 }
 }

 public static boolean areStringsEqual(String str1, String str2) {
 if (str1 == null && str2 == null) {
 return true;
 }
 if (str1 == null || str2 == null) {
 return false;
 }

 if (str1.length() != str2.length()) {
 return false;
 }
 for (int i = 0; i < str1.length(); i++) {
 if (str1.charAt(i) != str2.charAt(i)) {
 return false;
 }
 }
 return true;
 }
}

