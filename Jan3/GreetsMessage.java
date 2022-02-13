package Jan3;
import java.util.Scanner;

public class GreetsMessage {
    public static void main(String[] args) {
        //Write a Java program that asks the user to enter his/her name and greets them
        //with “Hello <name>, have a good day” text.
        //CWH JAVA Question 3

        //Scanner Object
        Scanner sc = new Scanner(System.in);

        //variable
        String userName;

        //Input
        System.out.print("Enter Your Name : ");
        userName = sc.next();

        //Printing output on screen
        System.out.print("Hello " +userName+ " , have a good day");

    }
}
