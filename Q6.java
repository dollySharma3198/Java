import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) 
    {
        
        int m,n;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter m:");
        m=sc.nextInt();

        if (m > 0)
        {
            n=1;
        }
        else if(m<0)
        {
            n=-1;
        }
        else
        {
            n=0;
        }
        System.out.println(" n = "+n);
        sc.close();

    }
}