/*🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 10 🚀

Question:
Write a program that prints only the even elements present at odd indices of a given array of integers.

Example:
Input:
6
3 4 5 6 8 7 10
Output: 4 6

Your Task:

Develop a program to print the even elements present at odd indices of the given array.*/
import java.util.Scanner;

public class TapDay10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter Array Elements:");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Even Elements at odd indices:");
        for(int i=1; i<n; i+=2)
        {
            if(a[i]%2 == 0)
            {
                System.out.print(a[i] +" ");
            }
        }

    }
    
}
