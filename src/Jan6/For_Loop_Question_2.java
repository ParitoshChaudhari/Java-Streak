package Jan6;
import java.util.Scanner;

public class For_Loop_Question_2 {
    public static void main(String[] args) {
        //CWH JAVA CHAPTER 4 Question 3
        //Write a program to print first n odd numbers using a for loop

        //Scanner Object
        Scanner scanner = new Scanner(System.in);

        //input
        System.out.println("Enter your Number: ");
        int userNum = scanner.nextInt(); //50

        for (int i = 1 ; i<=userNum;i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
