import java.util.Scanner;
public class Leap_Year{
    public static void main(String[] args) 
    {
        int year1;    
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the  year ");
        year1=sc.nextInt();
      if((year1 %4==0)&& (year1 %100!=0)||(year1%400==0))
      {
        System.out.println( year1+ "is a leap year ");
      }
       else
       {
            System.out.println(year1+ " is not a leap year");
      }
      
        }
    
}