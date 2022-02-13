package Feb9;

public class MethodsVarArgs {

    static int add(int num1,int num2){
        return num1+num2;
    }

    static int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }

    static int add(int ...arr){
        //variable arguments
        /*
        in this we use array as an argument
        which is denoted by triple dot {DataType ...ArrayName}
         */
        int temp = 0;
        for(int elements: arr){
            temp +=elements;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println("Answer of 2 is : " + add(23,45));
        System.out.println("Answer of 3 is : " + add(56,34,67));
        System.out.println("Answer of varArgs is : " + add(78,45,6,7,8,89,3,4,56,7,7));

    }
}
