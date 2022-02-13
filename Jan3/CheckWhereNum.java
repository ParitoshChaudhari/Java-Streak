package Jan3;
import java.util.Scanner;

public class CheckWhereNum {
    public static void main(String[] args) {
        //Write a Java program to detect whether a
        //number entered by the user is an integer or not.
        //CWH java question 5

        //Scanner object
        Scanner sc = new Scanner(System.in);

        //variable
        boolean userNum;

        //input as well output
        System.out.print("Enter your number: ");
        System.out.println(userNum = sc.hasNextInt());
    }
}
