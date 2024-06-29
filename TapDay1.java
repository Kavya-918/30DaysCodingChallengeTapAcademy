/*
 * 
 Day 01 🚀

Question:
Write a program that checks whether a given integer value n ends with 0.

Example:
Input: 1230
Output: Yes

Your Task:
Develop a program to check whether a given integer n ends with 0.

 */

import java.util.Scanner;
public class TapDay1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 10 == 0)
        {
            System.out.println("Yes "+num+" Ends with Zero");
        }
        else
        {
            System.out.println("No "+num+" Not end  with Zero");
        }
        
    }
    
}
