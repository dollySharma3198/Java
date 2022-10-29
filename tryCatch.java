import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatch  {  

    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);
        int num=0;
        System.out.println("enter a number ");
        try
        {
            // num=sc.nextInt();
            String s=null;
            s.length();
        }
        catch(Exception i )
        {
            System.out.println("please enter the value again!");
            i.printStackTrace();
        }

        System.out.println(num);

    }
}
