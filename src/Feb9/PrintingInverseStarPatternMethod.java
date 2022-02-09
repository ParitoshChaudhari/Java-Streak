package Feb9;

import java.util.Scanner;

public class PrintingInverseStarPatternMethod {

    static void inverseStarPattern(int num){
        for(int i=num;i>=0;i--){
            for(int j=i;j>=0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        inverseStarPattern(num);
    }
}
