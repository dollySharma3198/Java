import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        // double num1=12.0, num2=25.0, num3=52.0;
        double num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number1 ");
        num1 = sc.nextDouble();
        System.out.print("enter the number2 ");
        num2 = sc.nextDouble();
        System.out.print("enter the number3 ");
        num3 = sc.nextDouble();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + "is the largest ");
            
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + "is the the largest number");
        } else {
            System.out.println(num3 + "is the the largest number");
        }

    }
}