/* 🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 05 🚀
Question:
Write a program that prints the first n two-digit prime numbers.
Example:
Input: 5
Output: 11 13 17 19 23
Your Task:
Develop a program to print the first n two-digit prime numbers.*/
import java.util.Scanner;
public class TapDay5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Prime To Be Printed:");
        int n = sc.nextInt();
        int number = 10;
        while (n > 0) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                n--;
            }
            number++;
        }
    }
    private static boolean isPrime(int number) {
        if(number <= 1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }
             return true;
}
}

