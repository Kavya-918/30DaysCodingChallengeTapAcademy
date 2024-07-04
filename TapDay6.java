/*🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 06 🚀
Question:
Write a program that prints the number of even factors of a given integer n.
Example:
Input: 10
Output: 2
Your Task:
Develop a program to print the number of even factors of the given integer n.*/
import java.util.Scanner;
public class TapDay6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Integer: ");
        int n = sc.nextInt();
        int evenFactCount = 0;
        for(int i=1; i<=n; i++)
        {
            if(n % i == 0)
            {
                if(i % 2 == 0)
                {
                    evenFactCount++;
                }
            }
        }
        System.out.println("Number of Even Factors: " +evenFactCount);
    }
}
