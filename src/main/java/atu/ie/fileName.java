package atu.ie;
import java.io.*;
import java.util.Scanner;

public class fileName {
    public static void main(String[] args) {
        System.out.println("Please enter a file name");
        Scanner input = new Scanner(System.in);
        String userInput;
        Scanner inputFile = null;

        while(true) {
            try {
                userInput = input.next();
                inputFile = new Scanner(new File(userInput));
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Not a valid file, please try again");
            }
        }
        System.out.println("You entered: " + userInput);

        while (inputFile.hasNext()){
            String str  = inputFile.nextLine();
            System.out.println(str);
        }
    }
}
