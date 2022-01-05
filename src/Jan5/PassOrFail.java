package Jan5;
import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        //CWH JAVA Chapter3 question 2
        //Write a program to find out whether a student is pass or fail;
        // if it requires a total of 40% and at least 33% in each subject to pass.
        // Assume 3 subjects and take marks as input from the user

        //Scanner Object
        Scanner sc = new Scanner(System.in);

        //variables
        float maths,science,english,average;

        //Input
        System.out.print("Enter your marks obtained in Maths : ");
        maths = sc.nextFloat();

        System.out.print("Enter your marks obtained in Maths : ");
        science = sc.nextFloat();

        System.out.print("Enter your marks obtained in Maths : ");
        english = sc.nextFloat();

        //if-else
        if((maths>=33) && (english>=33) && (science>=33)){
            average = ((maths+english+science)/3.0f);
            if(average>=40){
                System.out.println("You are passed in exam");
            }else{
                System.out.println("You are fail in exam because your average percentage is less than 40");
            }
        }else{
            System.out.println("You are fail in exam as you dont fill criteria of 33 marks in each subject");
        }

    }
}
