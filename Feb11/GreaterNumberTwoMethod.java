package Feb11;

import java.util.Scanner;

public class GreaterNumberTwoMethod {

    public static void greaterTwoNum(int number1 , int number2){
        if(number1>number2){
            System.out.println(number1 + " is greater number");
        }
        else if(number1<number2){
            System.out.println(number2 + " is greater number");
        }
        else{
            System.out.println("Both are equal");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        greaterTwoNum(num1,num2);
    }
}
