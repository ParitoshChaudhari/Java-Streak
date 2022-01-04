package Jan4;
import java.util.Scanner;

public class ConvertSpaceToUnderscore {
    public static void main(String[] args) {
        //CWH java chapter 3 question 2
        //Write a Java program to replace spaces with underscores.

        //Scanner Object
        Scanner sc = new Scanner(System.in);

        //Variable
        String userInput;

        //Input
        System.out.print("Enter your string : ");
        userInput = sc.nextLine();

        //output + processing
        System.out.println("Your converted string is : " +userInput.replace(' ','_'));
    }
}
