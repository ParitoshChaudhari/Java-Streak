package Feb9;

import java.util.Scanner;

public class PrintingStarPatternUsingMethods {

    static void starPattern(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        starPattern(n);
    }
}
