/* 🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 13 🚀
Question:
Write a program that prints the product of all even elements present in a given array of integers.
Example:
Input:
5
6 9 28 7 21
Output: 168
Your Task:
Develop a program to print the product of all even elements present in the given array.*/
import java.util.Scanner;

public class TapDay13 {
    public static int productOfEvenElements(int[] arr)
    {
        int product=1;
        boolean hasEven = false;//No even in array print 0
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                product *=arr[i];
            }
        }
        return hasEven ? product : 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Elements:");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        int product = productOfEvenElements(arr);
        System.out.print("Product of even elements:" +product);
        
        
    }
    
}
