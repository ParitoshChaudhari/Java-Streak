package Jan10;
import java.util.Scanner;

public class TableProblem1 {
    public static void main(String[] args) {
        //CWH JAVA CHAPTER 5 Question 3
        //Write a program to print the multiplication table of a given number n.

        //Scanner object
        Scanner sc = new Scanner(System.in);

        //input + variable
        int userInputTable = sc.nextInt();

        //loop
        for(int i =1 ; i <= 10 ; i++){
            System.out.println(i + " * " + i + " = " + (userInputTable*i));
        }
    }
}
