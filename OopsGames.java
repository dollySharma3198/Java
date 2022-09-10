//crete a cless tommy vecetli for rokstar games of hitting,running,firing
import java.util.Scanner;
class Tommy
{
    
  public void hit()
    {
    System.out.println("hitting the enenmy");
    }
    public void run()
    {
    System.out.println("running from the enemy");  
    }
    public void fire()
    {
    System.out.println("firing on the enemy"); 
    }
    }
public class Main.java{

    public static void main(String[] args)
    {
        Tommy player1=new Tommy();
        player1.hit();
        player1.run();
        player1.fire();
        
        Tommy player2=new Tommy();
        player2.hit();
        player2.run();
        player2.fire();
    }
}
