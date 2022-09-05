import java.util.Scanner;
public class calculate_simpleInterest{
    public static void main(String[]args){
            
        
        float p,r,si;
        int n;
        System.out.println("enter the values of p n and r");
        Scanner sc=new Scanner(System.in);
        p=sc.nextFloat();
        n=sc.nextInt();
        r=sc.nextFloat();
        si=(p*n*r)/100;
    System.out.println("simple interest =Rs."+si);
    }

    }
