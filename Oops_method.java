// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Animal
{
int legs;
String name;
float height;
String color;
void call()
{
    System.out.println("we can call to animals");
    
}
void showAnimaldetails()
{
    System.out.println("name of animal"+name);
}
}
public class Oops_method{
    public static void main(String[] args) {
     
       Animal ani=new Animal();
        ani.name="lion";
        
        Animal ani2=new Animal();
        ani2.name="tiger";
        
        
       ani.showAnimaldetails();
       ani2.showAnimaldetails();
        
        System.out.println("Animal name"+ani.name);
         System.out.println("Animal name"+ani2.name);
    }
}