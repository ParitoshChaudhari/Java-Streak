package Jan4;
import java.util.Scanner;

public class EncryptDecrypt {
    public static void main(String[] args) {
        //Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
        //CWH JAVA Question 2 ch 2

        //Scanner object
        Scanner sc = new Scanner(System.in);

        //Variable
        int encryptionUserNum,decryptionUserNum;

        //input and output with processing
        System.out.print("Enter a number which you wants to encrypt : ");
        encryptionUserNum = sc.nextInt();
        encryptionUserNum += 8;
        System.out.println("Your encrypted number is : " + encryptionUserNum);

        System.out.print("Enter a number which you wants to decrypt : ");
        decryptionUserNum = sc.nextInt();
        decryptionUserNum -= 8;
        System.out.print("Your decrypted number is : " +decryptionUserNum);
    }
}
