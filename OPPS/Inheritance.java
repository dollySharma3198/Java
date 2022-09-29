class A{
    public int a;
    public int dolly(){
        return 3;

    }
    public void meth2(){
        System.out.println("i am methhod 2 of class A");

    }
}
class B extends A{
//check override
   public void meth2(){
       System.out.println("i am methhod 2 of class B");
   }
   public void meth3(){
       System.out.println("i am methhod 3 of class B");
   }
   
}
public class Inheritance
{
	public static void main(String[] args) {
	   A a=new A();
	   a.meth2();


	   B b=new B();
	   b.meth3();
	}
}
