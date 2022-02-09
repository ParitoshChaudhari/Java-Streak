package Feb9;

public class FactorialMethod {
    static int factorial(int number){
        if(number==1 || number==0){
            return 1;
        }
        else{
            return number*factorial(number-1);
        }
    }

    public static void main(String[] args) {
        int num =4;
        System.out.println(factorial(num));
    }
}
