/* 🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 20 🚀

Question:
Write a program that merges two sorted arrays into a single sorted array in ascending order.

Example:
Input:
3 3
1 3 5
2 4 6
Output:
1 2 3 4 5 6

Your Task:
Develop a program to merge two sorted arrays into a single sorted array in ascending order.*/

import java.util.Scanner;
public class TapDay20 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int n1 = scanner.nextInt();
 int n2 = scanner.nextInt();
 int[] arr1 = new int[n1];
 for (int i = 0; i < n1; i++) {
 arr1[i] = scanner.nextInt();
 }
 int[] arr2 = new int[n2];
 for (int i = 0; i < n2; i++) {
 arr2[i] = scanner.nextInt();
 }
 int[] mergedArray = sort(arr1, arr2);
 for (int i = 0; i < mergedArray.length; i++) {
 System.out.print(mergedArray[i] + " ");
 }
 }
 public static int[] sort(int[] arr1, int[] arr2) {
 int n1 = arr1.length;
 int n2 = arr2.length;
 int[] mergedArray = new int[n1 + n2];
 int i = 0, j = 0, k = 0;
 while (i < n1 && j < n2) {
 if (arr1[i] <= arr2[j]) {
 mergedArray[k++] = arr1[i++];
 } else {
 mergedArray[k++] = arr2[j++];
 }
 }
 while (i < n1) {
 mergedArray[k++] = arr1[i++];
 }
 while (j < n2) {
 mergedArray[k++] = arr2[j++];
 }
 return mergedArray;
 }
}
