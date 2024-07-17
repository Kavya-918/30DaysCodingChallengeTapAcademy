/* 🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 19 🚀

Question:
Write a program that prints all pairs of integers from a given array whose product is greater than a given integer K.

Example:
Input:
5
1 2 3 4 5
K: 6
Output:
2 4
2 5
3 4
3 5
4 5

Your Task:

Develop a program to print all pairs from the given array whose product is greater than K.*/
import java.util.Scanner;

public class TapDay19 
{
    public static void pairProduct(int[] arr,int n,int k)
    {
        for (int i = 1; i <n; i++) {
            for (int j = i+1; j <n; j++) {
                if(arr[i]*arr[j] > k)
                {
                    System.out.println(arr[i]+" " +arr[j]);
                }       
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        pairProduct(arr, n, k);
    }    
}
