package Jan3;
import java.util.Scanner;

public class KilometerIntoMiles {
    public static void main(String[] args) {
        //Write a Java program to convert Kilometers to miles.
        //CWH JAVA question 4

        //Scanner object
        Scanner sc = new Scanner(System.in);

        //variable
        float userNum,miles;

        //input
        System.out.print("Enter Kilometer : ");
        userNum = sc.nextFloat();

        //conversion
        miles = (userNum/1.609f);

        //output
        System.out.println(userNum + " Kilometer into miles is : " + miles);
    }
}
