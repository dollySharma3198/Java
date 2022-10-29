import java.util.Scanner;
class Calculator
{
    double divide(double n1,double n2)
    {
        return n1/n2;
    }
    double add(double a,double b)
    {
        return a+b;
    }
}
class ExceptionHandling_1
{
    public static void main(String[] args) {
        
        Calculator c=new Calculator();
        System.out.println("enter 2 numbers ");
        Scanner sc=new Scanner(System.in);
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        // double result=c.divide(n1,n2);
        // System.out.println(result);

        // System.out.println(n1/n2);
        // System.out.println(10/0);
        // System.out.println("hello i will not execute");
        // System.out.println("hello i will not execute");
        // System.out.println("hello i will not execute");
        // System.out.println("hello i will not execute");
        // System.out.println("hello i will not execute");
        // System.out.println("hello i will not execute");

        // String s="";
        // System.out.println(s.substring(-4));
        // int arr[]={56};
        // System.out.println(arr[4]);

        double result=c.add(n1, n2);
        System.out.println("the result is "+result);
    }
}
