//What is static keyword in Java give an example?

// When a member is declared static, it can be accessed before any objects of 
//its class are created,  and without reference to any object. 

class anim
{
   static int num=55;
    static String institute="mega";
    static void greet()

{
    anim a=new anim();
    System.out.println("hello everyone  " +num);
    System.out.println("hello everyone" +a.num);
    System.out.println("hello everyone" +institute);
} 
}
public class staticDemo
{
	public static void main(String[] args) {
		anim c=new anim();
	    c.greet();
	    anim c2=new anim();
	    c2.greet();
	    anim c3=new anim();
	    c3.greet();
	}
}
