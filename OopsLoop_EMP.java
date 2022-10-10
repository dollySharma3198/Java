import java.util.Scanner;
class employee
{
    String name;
     int id;
    int salary;
     void inputData(){
     System.out.println("entre the detials of employee");
     Scanner sc=new Scanner(System.in);
      System.out.println("name of the employee: ");
     name=sc.next();
     System.out.println("id of the employee : ");
     id=sc.nextInt();
     System.out.println("salary of the employee: ");
     salary=sc.nextInt();
     
}
void showDetails(){
System.out.println("details of employee: ");
System.out.println("name :"+name);
System.out.println("id :"+id);
System.out.println("salary :"+salary);
}
}
public class Main
{
	public static void main(String[] args) {
		employee emp[]=new employee[4];
		for(int i=0; i<emp.length; i++)
		{
		    emp[i]=new employee();
		    emp[i].inputData();
		    emp[i].showDetails();
		}
	}
}
