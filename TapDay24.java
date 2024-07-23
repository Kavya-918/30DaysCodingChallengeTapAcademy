/* 
🚀30DaysCodeAtTAPAcademy Challenge - Day 24 🚀

Question:
Write a program that prints the longest subarray in increasing order from a given array of integers.
Example:
Input:
10
2 4 5 3 5 7 8 11 12 4
Output:
3 5 7 8 11 12
Your Task:
Develop a program to print the longest subarray in increasing order. */

import java.util.Scanner;

class TapDay24{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 int[] a = new int[n];
 for (int i = 0; i < n; i++) {
 a[i] = sc.nextInt();
 }

 int maxLength = 1;
 int currentLength = 1;
 int start = 0, end = 0, temp = 0;
 for(int i=1;i<n;i++){
 if(a[i]>a[i-1]){
 currentLength++;
 }
 else{
 if(currentLength > maxLength){
 maxLength = currentLength;
 start = temp;
 end = i - 1;
 }
 currentLength = 1;
 temp = i;
 }
 }
 if(maxLength<currentLength){
 maxLength = currentLength;
 start = temp;
 end = n-1;
 }
 for(int i=start;i<=end;i++){
 System.out.print(a[i]+" ");
 }
 }
}
