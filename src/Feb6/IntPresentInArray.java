package Feb6;
import java.util.Scanner;

public class IntPresentInArray {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int [] marks={23,56,98,90,78,34, 0};
        int userInput;
        boolean isPresent = false;

        System.out.print("Enter number you want to search : ");
        userInput = scanner.nextInt();

        for (int mark : marks) {
            if (mark == userInput) {
                isPresent = true;
                break;
            }
        }

        if(isPresent){
            System.out.println("Yes it is present");
        }
        else{
            System.out.println("no it is not present");
        }

    }
}
