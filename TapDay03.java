/*🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 03 🚀

Question:
Write a program that checks whether a given integer value n is Positive, Negative, or Zero.

Example:
Input: 50
Output: Positive

Your Task:

Develop a program to check if the given integer value n is Positive, Negative, or Zero.*/
import java.util.Scanner;

public class TapDay3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = sc.nextInt();
        if(num >= 0)
        {
            if(num == 0)
            System.out.println("The Number is Zero");
            else
            System.out.println("The Number is Positive");  
        }
        else
        {
            System.out.println("The Number is Negative");
        }
    }
    
}
