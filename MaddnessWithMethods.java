import java.util.Scanner;

// MaddnessWithMethods.java
// dH 2/9/2025
// You will explore the use of functions in Java. You will create a program that involves three distinct functions: getAnIntFromTheUser, compareTwoInts, and sumTwoInts. The program will demonstrate how functions can be used to break down a problem into smaller, manageable parts.

public class MaddnessWithMethods {
    //This function is used to request an integer from the user. static means it belongs in main class
    static int getAnIntFromTheUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me an integer:");
        //This line will return integer to whatever called this function (IMPORTANT TO REMEMBER)
        return scanner.nextInt();
    }
    // compares the users ints with each other
     public static void compareTwoInts(int a, int b){
        if (a < b){
            System.out.println(a+" < "+b);
        } else if (a > b){
            System.out.println(a+" > "+b);
        } else {
            System.out.println(a+" = "+b);
        }
     }
     // adds the sum of both ints together
     public static int sumTwoInts(int a, int b){
        return a + b;
     }

     public static void main(String[] args) {
        //calls for function listed at start of code
        int a = getAnIntFromTheUser();
        int b = getAnIntFromTheUser();
        //calling for the function above
        compareTwoInts(a, b);
        //calling for the function above
        int sum = sumTwoInts(a, b);
         System.out.println("The sum of " +a + " and " + b + " equals: "+ sum);
     }
}