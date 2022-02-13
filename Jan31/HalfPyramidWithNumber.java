package Jan31;

import java.util.Scanner;

public class HalfPyramidWithNumber {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);
        //variable
        int num= sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
