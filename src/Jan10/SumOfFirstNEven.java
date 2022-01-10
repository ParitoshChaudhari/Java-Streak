package Jan10;
import java.util.Scanner;

public class SumOfFirstNEven {
    public static void main(String[] args){
        //CWH JAVA CHAPTER 5 Question 2
        //Write a program to sum first n even numbers using a while loop.

        //Scanner Object
        Scanner sc = new Scanner (System.in);

        //Variable + input
        int userNum = sc.nextInt();
        int counter = 0;
        int i = 0;

        //loop

        while (userNum>=i){
            if((i%2)==0){
                counter +=i;
            }
            i++;
        }
        System.out.println("Total of all even numbers are : " +counter);
    }
}
