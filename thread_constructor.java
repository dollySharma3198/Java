//thread constructor 
//error
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    void run(){
        int i=10;
        System.out.println("hello");
        while(true){
            System.out.println("i am a thread");
        }
    }
}
public class Main  //thread_constructor
{
	public static void main(String[] args) {
	MyThread t=new MyThread(name:"dolly");
	MyThread t1=new  MyThread(name:"parul");
	t.start();
	t1.start();
	System.out.println("the id of the thread t is " t.getId());
	System.out.println("the name of the thread t is " t.getName());
    System.out.println("the id of the thread t1 is " t1.getId());
	System.out.println("the name of the thread t1 is " t1.getName());
	}
}
