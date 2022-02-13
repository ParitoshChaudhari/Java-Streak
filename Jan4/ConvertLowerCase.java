package Jan4;
import java.util.Scanner;

public class ConvertLowerCase {
    public static void main(String[] args) {
        //CWH java Chapter 3 question 1
        //Write a Java program to convert a string to lowercase

        //Scanner Object
        Scanner sc = new Scanner(System.in);

        //Variable
        String userInputString;

        //Input
        System.out.print("Enter your string : ");
        userInputString = sc.nextLine();

        //output and processing
        System.out.println("Your lowercase string is : " + userInputString.toLowerCase());

    }
}
