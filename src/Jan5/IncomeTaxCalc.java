package Jan5;
import java.util.Scanner;

public class IncomeTaxCalc {
    public static void main(String[] args) {
        //CWH JAVA Chapter3 question 3
        //Calculate income tax paid by an employee to the government as per the slabs mentioned below:
        //
        //   Income Slab	Tax
        //   2.5L – 5.0L  	5%
        //   5.0L – 10.0L 	20%
        //   Above 10.0L	30%

        //Scanner object
        Scanner sc = new Scanner(System.in);

        //variable
        float userSalaryInput,taxAmount;

        //input
        System.out.print("Enter your salary : ");
        userSalaryInput = sc.nextFloat();

        //if-else (for taxation)
        if(userSalaryInput<2.5f)
        {
            System.out.println("You dont have to pay tax");
        }
        else if((userSalaryInput>=2.5f) && (userSalaryInput<=5.0f))
        {
            System.out.println("You have to pay 5% tax");
            taxAmount = userSalaryInput%0.05f;
            System.out.println("you have to pay tax value rupees: " +taxAmount);
        }
        else if((userSalaryInput>=5.0f) && (userSalaryInput<=10.0f))
        {
            System.out.println("You have to pay 20% tax");
            taxAmount = userSalaryInput%0.20f;
            System.out.println("you have to pay tax value rupees: " +taxAmount);
        }
        else if(userSalaryInput>10.0f)
        {
            System.out.println("You have to pay 30% tax");
            taxAmount = userSalaryInput%0.30f;
            System.out.println("you have to pay tax value rupees: " +taxAmount);
        }
    }
}
