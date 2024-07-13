/* 🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 14 🚀

Question:
Write a program that prints all the prime numbers present in a given array of integers.

Example:
Input:
5
7 9 10 11 19
Output: 7 11 19

Your Task:

Develop a program to print all the prime numbers present in the given array.*/
import java.util.Scanner;

public class TapDay14 
{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Size of the Array:");
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i=0; i<n; i++)
       {
        arr[i] = sc.nextInt();
       }
       for(int i=0; i<n; i++)
       {
        if(isPrime(arr[i]))
        {
            System.out.print(arr[i]+" ");
        }
       }
    }
    public static boolean isPrime(int num)
    {
        if(num <= 1)
        {
            return false;
        }
        for(int i=2; i<=Math.sqrt(num); i++)
        {
            if(num %i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
}
