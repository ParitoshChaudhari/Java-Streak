package Jan5;
import java.util.Scanner;

public class DayTeller {
    public static void main(String[] args) {
        //CWH JAVA Chapter3 question 4
        //Write a Java program to find out the day of the week given the number
        // [1 for Monday, 2 for Tuesday … and so on!]

        //scanner object
        Scanner sc = new Scanner(System.in);

        //variable
        int dateInput;

        //input
        System.out.println("Enter date : ");
        dateInput = sc.nextInt();

        //switch
        switch (dateInput) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> {
                System.out.println("Enter Valid date");
            }
        }
    }
}
