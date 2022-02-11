package Feb11;

import java.util.Scanner;

public class circumferenceOfCircleMethod {
    public static float circumference(float radiusOfCircle){
        return (float) (2.0f*3.14*radiusOfCircle);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();

        System.out.println("circumference of circle is : " + circumference(radius));
    }
}
