import java.util.Scanner; // taking input from user

public class CBSECALC {
    // CBSE Percentage calculator
    // problem 1
    public static void main(String[] args) {
        // Scanner Object
        Scanner sc = new Scanner(System.in);

        // Variables
        float maths, english, hindi, science, socialScience, totalMarksEarn,percentage;

        // Taking input from user
        System.out.print("Enter your marks obtain in maths (out of 100) : ");
        maths = sc.nextFloat();

        System.out.print("Enter your marks obtain in English (out of 100) : ");
        english = sc.nextFloat();

        System.out.print("Enter your marks obatin in hindi (out of 100) : ");
        hindi = sc.nextFloat();

        System.out.print("Enter your marks obtain in Science (out of 100) : ");
        science = sc.nextFloat();

        System.out.print("Enter your marks obtain in social Science (out of 100 ) : ");
        socialScience = sc.nextFloat();

        //logic for percantage 
        totalMarksEarn = (maths+english+hindi+science+socialScience);
        percentage = (totalMarksEarn/500)*100; //using 500 because it is total of all subjects

        //message with perctange
        System.out.println("Your percentage is : " + percentage);

    }
}