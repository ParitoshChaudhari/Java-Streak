package Feb9;

public class MethodsWithObject {

    int sumOfThisClass(int num1,int num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        int num1=90;
        int num2=67;

        MethodsWithObject mwo=new MethodsWithObject();
        System.out.println("Answer is : " + mwo.sumOfThisClass(num1,num2));
    }
}
