import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch_exception
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=1,num2=3,num3;
		int a1=10, a2=10, a3;
		System.out.println("enter 2 Number");
		try{
		    num1=sc.nextInt();
		    num2=sc.nextInt();
		    num3=num1+num2;
		    a1=sc.nextInt();
		    a2=sc.nextInt();
		    a3=a1-a2;
		   System.out.println("the result is " +num3);
		   System.out.println("the result is " +a3);
		   
		   
		}
		catch(ArithmeticException i)
		{
		    System.out.println("ArithmeticException is do occured somthing");
		    i.printStackTrace();
		}
		catch(InputMismatchException i)
		{
		    System.out.println("input exception is do occured somthing");
		    i.printStackTrace();
		}
		catch(Exception i)
		{
		    System.out.println("exception is do occured somthing");
		    i.printStackTrace();
		}
		    
		
	}
}
