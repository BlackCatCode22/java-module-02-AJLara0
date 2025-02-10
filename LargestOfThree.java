import java.util.Scanner;

// LargestOfThree.java
// dH 2/9/2025
// This program, titled "LargestOfThree.java" is designed to help you understand conditional statements in Java. Your task is to write a program that asks the user for three integers, determines the largest among them using nested if statements, and outputs the largest integer.
public class LargestOfThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me your first number.");
        int num1 = scanner.nextInt();

        System.out.println("Give me your second number.");
        int num2 = scanner.nextInt();

        System.out.println("Give me your third number.");
        int num3 = scanner.nextInt();

        int largestnum;

        //checking for num1 being less/equal to num2
        if (num1 <= num2){
        //if above line is true this line checks if num2 is less/equal to num 3
            if (num2 <= num3) {
                largestnum = num3;
            } else {
                largestnum = num2;
                }
            } else {
            if (num2 <= num3) {
                largestnum = num3;
            } else {
                largestnum = num1;
            }
        }
        System.out.println("Your largest number out of the 3 is: "+ largestnum);
        }
    }