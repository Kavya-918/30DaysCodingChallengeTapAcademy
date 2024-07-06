/*🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 08 🚀
Question:
Write a program that prints the Least Common Multiple (LCM) of two given integer values.
Example:
Input:
12
18
Output: 36
Your Task:
Develop a program to print the LCM of the given two integer values.*/
import java.util.Scanner;

    public class TapDay8 {
        public static int calculateGCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
        public static int calculateLCM(int a, int b) {
            return (a * b) / calculateGCD(a, b);
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first no: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second no: ");
            int num2 = scanner.nextInt();
            int lcm = calculateLCM(num1, num2);
            System.out.println("LCM Of Two Numbers is:"+lcm);
        }
    }


