import java.util.Scanner;
class employee
{
String name;
float salary;
int id;
void inputDetails(String n,float s,int id )
{
    
    name=n;
    salary=s;
    this.id=id;
}
void showDetails()
{
    System.out.println("name " +name );
     System.out.println("salary " +salary );
      System.out.println("id " +id);
   
}
}

public class employeeObject
{
	public static void main(String[] args) 
	{
	employee n1=new employee();
	n1.inputDetails("dolly",405.2f,12);
	n1.showDetails();
	
	}
}

