package Feb11;

import java.util.Scanner;

public class OddNumberTillUserMethod {
    public static int oddNumberSum(int num){
        int temp = 0;
        for(int i=1;i<=num;i++){
            if((i%2)!=0){
                temp += i;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt();

        System.out.println("Addition of all odd number is : " + oddNumberSum(userNum));
    }
}
