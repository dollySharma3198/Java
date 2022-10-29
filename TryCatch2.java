import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch2 {

    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);
        int num=0,num2=0,num3;
        System.out.println("enter a number ");
        try
        {
            num=sc.nextInt();
            num2=sc.nextInt();
            num3=num/num2;
            System.out.println("the result is "+num3);
            
        }
        catch(ArithmeticException i )
        {
            System.out.println("Arit Exception Occured Do Something");
            i.printStackTrace();

        }
        catch(InputMismatchException i )
        {
            System.out.println("inp Exception Occured Do Something");
            i.printStackTrace();

        }
        catch(Exception i )
        {
            System.out.println("Exception Occured Do Something");
            i.printStackTrace();

        }

        // System.out.println(num);

    }
}
