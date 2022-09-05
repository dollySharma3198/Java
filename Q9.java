import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {

        int x, y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x and y ");
        x=sc.nextInt();
        y=sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("The point is in the first quadrant \n ");
        } else if (x < 0 && y > 0) {
            System.out.println("The point is in the second quadrant \n");
        } else if (x < 0 && y < 0) {
            System.out.println("The point is in the third quadrant \n");
        } else if (x > 0 && y < 0) {
            System.out.println("The point is in the fourth quadrant \n");
        } else {
            System.out.println("at origin or any line ! \n");
        }
        sc.close();
    }
}