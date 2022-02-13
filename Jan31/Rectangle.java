package Jan31;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){

        //Scanner object
        Scanner sc = new Scanner(System.in);
        //variables
        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i = 1 ; i <= row ; i++){
            for(int j = 1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
