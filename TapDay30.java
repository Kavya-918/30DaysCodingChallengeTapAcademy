/*🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 30 🚀

Question:
Write a program to print the number of pairs present in a given array of integers.

Example:
Input:
10
3 1 7 7 1 7 7 1 4 3
Output: 4

Your Task:

Develop a program in your preferred programming language to count the number of pairs in the given array.*/

import java.util.Scanner;
public class TapDay30 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int n = scanner.nextInt();
 int[] array = new int[n];
 for (int i = 0; i < n; i++) {
 array[i] = scanner.nextInt();
 }
 int pairs = countPairs(array);
 System.out.println(pairs);
 }
 public static int countPairs(int[] array) {
 int maxVal = 0;
 for (int num : array) {
 if (num > maxVal) {
 maxVal = num;
 }
 } 
 int[] freq = new int[maxVal + 1];
 int pairs = 0;
 for (int num : array) {
 freq[num]++;
 }
 for (int count : freq) {
 pairs += count / 2;
 } 
 return pairs;
 }
}
