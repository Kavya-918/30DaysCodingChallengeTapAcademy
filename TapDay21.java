/* 🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 21 🚀

Question:
Write a program that prints the sum of prime elements from two given arrays.

Example:
Input:
3 3
2 3 4
5 6 7
Output: 17

Your Task:

Develop a program to print the sum of prime elements from the two given arrays.*/
import java.util.Scanner;

public class TapDay21 {
 public static boolean checkPrime(int n) {
 if (n <= 1) {
 return false;
 }
 for (int i = 2; i * i <= n; i++) {
 if (n % i == 0) {
 return false;
 }
 }
 return true;
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt(); 
 int m = sc.nextInt(); 
 int[] a = new int[n];
 int[] b = new int[m];
 for (int i = 0; i < n; i++) {
 a[i] = sc.nextInt();
 }
 for (int i = 0; i < m; i++) {
 b[i] = sc.nextInt();
 }
 int sumOfPrimes = 0;
 for (int i = 0; i < n; i++) {
 if (checkPrime(a[i])) {
 sumOfPrimes += a[i];
 }
 }
 for (int i = 0; i < m; i++) {
 if (checkPrime(b[i])) {
 sumOfPrimes += b[i];
 }
 }
 System.out.println(sumOfPrimes);
 }
}
