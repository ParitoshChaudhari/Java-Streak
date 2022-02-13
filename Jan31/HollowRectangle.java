package Jan31;
import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        //Scanner object
        Scanner sc =new Scanner(System.in);
        //variables
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1 ;i<=n;i++){
            for(int j = 1;j<=m;j++){
                if(i==1 || i==n || j==m || j==1 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
