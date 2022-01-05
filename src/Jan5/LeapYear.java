package Jan5;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //CWH JAVA Chapter3 question 5
        //Write a Java program to find whether a year entered by the user is a leap year or not.

        //Scanner object
        Scanner scanner = new Scanner(System.in);

        //variable
        int userInputYear;

        //input
        System.out.println("Enter year : ");
        userInputYear = scanner.nextInt();

        //if-else
        if((userInputYear%400 == 0) && (userInputYear%4 ==0))
        {
            System.out.println("Year is leap year");
        }
        else
        {
            System.out.println("Year is not a leap year");
        }

    }
}
