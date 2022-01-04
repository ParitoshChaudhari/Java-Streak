package Jan4;
import java.util.Scanner;

public class DoubleAndTripleSpaces {
    public static void main(String[] args) {
        //CWH java chapter 3 question 4
        //Write a Java program to detect double and triple spaces in a string

        //Scanner Object
        Scanner sc = new Scanner(System.in);

        //variable
        String userInput;

        //input
        System.out.print("Enter your string : ");
        userInput = sc.nextLine();

        //output
        System.out.println("Double space in string at index : " +userInput.indexOf("  "));
        System.out.println("Triple space in string at index : " +userInput.indexOf("   "));
    }
}
