/* 🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 22 🚀

Question:
Write a program that prints all the subarrays from a given array of n integers whose product is equal to a given value k.

Example:
Input:
5
10 5 5 2 50
50
Output:
50
10 5
5 5 2

Your Task:

Develop a program to print all subarrays whose product is equal to k.*/
import java.util.Scanner;
public class TapDay22 {
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the number of elements in the array:");
 int n= sc.nextInt();
 int a[]=new int[n];
 System.out.print("Enter the elements of the array:");
 for(int i=0;i<n;i++)
 {
 a[i]= sc.nextInt();
 }
 System.out.print("Enter the value of k:");
 int k= sc.nextInt();
 int size=1;
 for(size=1;size<=a.length;size++)
 {
 for(int i=0;i<=a.length-size;i++)
 {
 int product=1;
 for (int j=i;j<i+size;j++)
 {
 product=product*a[j];
 }
 if(product==k)
 {
 for(int j=i;j<i+size;j++)
 {
 System.out.print(a[j]+" ");
 }
 System.out.println();
 }
 }
 }
 }
}
