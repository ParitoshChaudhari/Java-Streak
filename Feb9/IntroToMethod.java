package Feb9;
import java.util.Scanner;

public class IntroToMethod {
    static int sum(int number1,int number2){
        return number1+number2;
    }

    public static void main(String[] args) {
        //int this problem we will create simple addition method
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("The sum is : " + sum(num1,num2));
    }
}
