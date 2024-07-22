/*🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 23 🚀

Question:
Write a program that rearranges an array of negative integers and 1s, such that all the 1s are moved to the start of the array.

Example:
Input:
10
-5 1 -1 -2 1 -6 1 -7 -9 1
Output:
1 1 1 1 -5 -1 -2 -6 -7 -9

Your Task:

Develop a program to rearrange the array as described.*/



import java.util.Arrays;
import java.util.Scanner;

public class TapDay23 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
  int[] arr = new int[n];
  for (int i = 0; i < n; i++) {
  arr[i] = sc.nextInt();
  }
  int[] rearrangedArr = rearrangeArray(arr);
  System.out.println(Arrays.toString(rearrangedArr));
  }
  
  public static int[] rearrangeArray(int[] arr) {
  int n = arr.length;
  int[] result = new int[n];
  int index = 0;
  for (int i = 0; i < n; i++) {
  if (arr[i] == 1) {
  result[index++] = 1;
  }
  }
  for (int i = 0; i < n; i++) {
  if (arr[i] != 1) {
  result[index++] = arr[i];
  }
  }
  
  return result;
 }
}
