/*
🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 02 🚀
Question:
Write a program that checks if a given number is a 3-digit number and divisible by both 3 and 5.
Example:
Input: 150
Output: Yes, it is a 3-digit number and divisible by both 3 and 5.
Your Task:
Develop a program to check if the given number is a 3-digit number and divisible by both 3 and 5.*/
import java.util.Scanner;
public class TapDay2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        //Logic-1
        if (isThreeDigitAndDivisibleBy3And5(number)) {
            System.out.println("Yes, it is a 3-digit number and divisible by both 3 and 5.");
        } else {
            System.out.println("No, it does not meet the criteria.");
        }

        scanner.close();
    }
    // Method to check if the number is a 3-digit number and divisible by both 3 and 5
    public static boolean isThreeDigitAndDivisibleBy3And5(int number) {
        return (number >= 100 && number <= 999) && (number % 3 == 0 && number % 5 == 0);
    }
}

/*  Logic-2
    public class TapDay2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = checkNumber(n);
        System.out.println(result);
        sc.close();
        }
       
        public static String checkNumber(int n) {
        if (n >= 100 && n <= 999) {
        if (n % 3 == 0 && n % 5 == 0) {
        return "Yes, it is a 3-digit number and divisible by both 3 and 5.";
        } else {
        return "No, it is a 3-digit number but not divisible by both 3 and 5.";
        }
        } else {
        return "No, it is not a 3-digit number.";
        }
        }*/




