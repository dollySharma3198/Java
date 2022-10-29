import java.util.Scanner;
class Calculator
{
    double divide (double n1,double n2);
    {
        return n1/n2;
    }
    double add (double a1,double a2);
    {
        return a1+a2;
    }
}

public ExceptionHandling_2 //error
{
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println("enter two numbers");
		Scanner sc=new Scanner(System.in);
		double n1=sc.nextDouble();
		double n2=sc.nextDouble();
		double result=c.add(n1, n2);
        System.out.println("the result is "+result);
    
		
		
	}
}
