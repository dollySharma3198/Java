//exception handling
class MyThread1 extends Thread{
    public void run(){
       int i=0;
        while (i<40){
            System.out.println("my thread is running");
            System.out.println("i m happy");
            i++;
        }
    }
}
class MyThread2 extends Thread
{
    public void run(){
        int i=0;
        while (i<40){
          System.out.println("thread 2 is good");
            System.out.println("i m sad");  
            i++;
        }
    }
}
public class ThreadCls   //Main
{
	public static void main(String[] args) {
	   // func1(); -->th
	   // func2();  -->th
	    //some lines of code 
	    MyThread1 t1=new MyThread1();
	    MyThread2 t2=new MyThread2();
	    t1.start();
	     t2.start();

	    
	    
		
	}
}
