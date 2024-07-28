/*🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 29 🚀
Question:
Write a program to print all the palindromic substrings of a given string.
Example:
Input:
hello
Output:
h
e
l
l
o
ll

Your Task:
Develop a program in your preferred programming language to print all the palindromic substrings of the given string.*/
public class TapDay29 {

 public static void main(String[] args) {
 String input = "hello";
 findPalindromicSubstrings(input);
 }
 public static void findPalindromicSubstrings(String str) {
 for (int center = 0; center < str.length(); center++) {
 expand(str, center, center); 
 }

 for (int center = 0; center < str.length() - 1; center++) {
 expand(str, center, center + 1); 
 }
 }
 public static void expand(String str, int left, int right) {
 while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
 printPalindrome(str.substring(left, right + 1));
 left--;
 right++;
 }
 }
 public static void printPalindrome(String palindrome) {
 System.out.println(palindrome);
 }
}
