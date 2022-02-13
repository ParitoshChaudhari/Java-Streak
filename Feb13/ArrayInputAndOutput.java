import java.util.Scanner;

public class ArrayInputAndOutput{
    public static void main(String[] args){
        //in this file we will learn input and output of array using loops

        //Scanner object
        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt(); //input array size from user
        int[] marks = new int[arraySize];

        //loop for input array elements from users
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }

        //for better understanding
        System.out.println("Array elements are : ");

        //loop for printing array elements {for-each} loop
        for(int elements :marks){
            System.out.println(elements);
        }
    }
}