package Feb11;

import java.util.Scanner;

public class AverageOfThreeMethod {
    public static float average(float number1,float number2 , float number3){
        return ((number1+number2+number3)/3);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();

        System.out.println("Average of 3 number is : " + (average(num1,num2,num3)));

    }
}
