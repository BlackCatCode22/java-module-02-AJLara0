import java.util.Scanner;

// ReversedStrings.java
// dH 2/9/2025
// You will create a simple program that takes a user's input string and reverses it. For example, if the user inputs "hello", the program will output "olleh".
public class ReversedStrings {
    public static void main(String[] args) {

        System.out.println("Give me a text to reverse");
        String output = "";

        Scanner reverse = new Scanner(System.in);
        String input = reverse.nextLine();

        for (int i = 0; i < input.length(); i++){
            output = input.charAt(i) + output;
        }

        System.out.println("Your reversed string is: "+ output);

    }
}