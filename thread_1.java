class MyThread extends Thread{
    @Override
    public void run(){
       // while(true){ //infinite loop 
       int i=0;
       while(i<500){
         System.out.println("my thread is running ");
        System.out.println("i am doing work");   
        i++;
        }
        
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
       // while(true){
       int i=0;
       while(i<1000){
         System.out.println("my thread 2 is running ");
        System.out.println("i am going somwhere"); 
        i++;
        }
        
    }
}
public class Main  //thread_1
{
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		MyThread2 t2=new MyThread2();
		t1.start();
		t2.start();
	}
}
