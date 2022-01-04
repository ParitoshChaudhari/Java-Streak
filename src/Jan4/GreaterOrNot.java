package Jan4;
import java.util.Scanner;

public class GreaterOrNot {
    public static void main(String[] args) {
        //Use comparison operators to find out whether a given number
        //is greater than the user entered number or not.
        //CWH JAVA Question 3 ch  2

        //Scanner object
        Scanner sc =new Scanner(System.in);

        //variable
        int userInputNum;

        //Input
        System.out.print("Enter a number : ");
        userInputNum = sc.nextInt();

        //output
        //45 is const by which we will check user input
        //and tell wherever user number is same or not
        System.out.println("Your answer is " + (45==userInputNum));
    }
}
