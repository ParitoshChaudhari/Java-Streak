package Jan31;

import java.util.Scanner;

public class FloyidTraingle {
    public static void main(String[] args) {
        //Scanner
        Scanner sc= new Scanner(System.in);
        //variable
        int num=sc.nextInt();
        int counter=0;

        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                counter++;
                System.out.print(counter + " ");
            }
            System.out.println();
        }
    }
}
