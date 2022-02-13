package Feb6;

public class SumOfArray {
    public static void main(String[] args) {
        float [] marks = {12.3f , 56.67f,46.0f,23.0f};
        float sum =0;

        for (float mark : marks) {
            sum += mark;
        }

        System.out.println("Total sum of array is : " + sum);
    }
}
