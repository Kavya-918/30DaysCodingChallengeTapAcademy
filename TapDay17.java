/*🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 17 🚀

Question:
Write a program that prints the first unique element in a given sorted array of integers.

Example:
Input:
10
1 2 2 3 3 4 5 5 5 6
Output:
1

Your Task:

Develop a program to print the first unique element in the given sorted array.*/
import java.util.Scanner;

public class TapDay17 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Size of an Array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int result = findFirstElement(n, a);
        System.out.println(result);
    }

    private static int findFirstElement(int n, int[] a) {
        if (n == 1) {
            return a[0];
        }

        if (a[0] != a[1]) {
            return a[0];
        }

        for(int i=1; i<n-1; i++) {
            if(a[i] != a[i-1] && a[i] != a[i+1]) {
                return a[i];
            }
        }

        if (a[n-1] != a[n-2]) {
            return a[n-1];
        }

        return -1;
    }

}
    

