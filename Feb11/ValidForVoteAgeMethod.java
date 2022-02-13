package Feb11;

import java.util.Scanner;

public class ValidForVoteAgeMethod {
    public static String ageVerification (int age){
        if(age>=18){
            return "You are eligible for vote";
        }
        else{
            return "You are not eligible for vote";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(ageVerification(age));
    }
}
