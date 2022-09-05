
//QUE-1
// ERROR
import java.util.Scanner;

class Sum_array1 {
    public static void main(String[] args) {

        float[] marks = { 48.5f, 44.2f, 63.0f, 44.1f, 65.0f };
        float sum = 0;
        for (float i : marks) 
        {
            sum = sum + i;
        }
        System.out.println("the value of sum is " + sum);
    }
}