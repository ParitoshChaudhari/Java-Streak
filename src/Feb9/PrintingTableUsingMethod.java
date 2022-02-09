package Feb9;
import java.util.Scanner;

public class PrintingTableUsingMethod {

    static void printTable(int number){
        for(int i=1;i<=10;i++){
            System.out.println(number + " * " + i + " = " + (number*i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printTable(num);
    }
}
