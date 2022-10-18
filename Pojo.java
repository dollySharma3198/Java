//POJO- PLAIN OLD JAVA OBJECT
//Error in this program 
class employee{
    private int id;
    private string name;
    private double salary;
    public void setId(id)
    {
        this.id=id;

    }
    public int getId(id)
{
    return id;
    
}    
public string setName(string name)
{
    this.name=name;
}
public void getName()
{
    return name;
}
public souble setSalary(double salary)
{
    this.salary=salary;
}
public void getSalary()
{
    return slary;

}

}
public class Main  //POJO-plain old Java object 
{
	public static void main(String[] args) {
		Employee e=new Employee();
		//e.id=101;
		e.setId(101);
		System.out.println(e.getId());
	}
}
