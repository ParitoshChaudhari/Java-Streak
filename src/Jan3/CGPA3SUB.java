package Jan3;
import java.util.Scanner;

public class CGPA3SUB {
    public static void main(String[] args) {
        //CWH Java question 2
        //Write a program to calculate CGPA using marks of three subjects (out of 100)

        //Scanner object for taking input
        Scanner sc = new Scanner(System.in);

        //Variables
        float english,maths,science,totalMarksObtained,cgpa;

        //Taking marks from user as a form of input
        System.out.print("Enter your marks obtained in English (out of 100) : ");
        english = sc.nextFloat();

        System.out.print("Enter your marks obtained in English (out of 100) : ");
        maths = sc.nextFloat();

        System.out.print("Enter your marks obtained in English (out of 100) : ");
        science = sc.nextFloat();

        //calculations
        totalMarksObtained = (english+maths+science);
        cgpa = (totalMarksObtained/300); //taking 300 as a total of 3 subjects

        //Printing message on screen
        System.out.println("Your C.G.P.A of 3 subject is : " +cgpa);


    }
}
