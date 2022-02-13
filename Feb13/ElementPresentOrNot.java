import java.util.Scanner;

public class ElementPresentOrNot{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt(); //array size
        int[] marks = new int[arrSize];

        //message
        System.out.println("Enter array elements :");

        //array element input
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }

        //message
        System.out.print("Enter number which you want to search : ");
        int checkNum = sc.nextInt();

        //checking element in array
        for(int i=0;i<marks.length;i++){
            if(checkNum == marks[i]){
                System.out.println("Index number is : " + i);
            }
        }
        
    }
}