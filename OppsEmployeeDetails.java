//EMPLOYEE DETAILS BUT ERROR IN MAIN.JAVA FILE
import java.util.Scanner;
class employee
{
    int id;
    string name;
    float salary;
    
    void inputData()
    {
        System.out.println("enter the details");
        Scanner.sc=new Scanner(System.in);
        System.out.print("enter the id of employee");
        id=sc.nextInt();
        System.out.print("enter the name of employee");
        name=sc.next();
        System.out.print("enter the salary of employee");
        salary=sc.nextFloat();
    }
    void showDetails()
    {
        System.out.println("employee details");
        System.out.println("employee id" +id);
        System.out.println("employee name" +name);
        System.out.println("employee salary" +salary);
        
    }
}
public class Main.java
{
    public static void main(String[] args)
    {
        employee s1=new employee();
        s1.inputData();
        s1.showDetails();
        
        employee s2=new employee();
         s2.inputData();
         s2.showDetails();
        
        // System.out.println("Hello, World!");
    }

}
