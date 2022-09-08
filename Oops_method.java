// OOPS METHOD
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
public class ClassAndObject{
    public static void main(String[] args) {
        Animal
       Animal=new Animal();
        Animal.name="lion";
        
        Animal=new Animal();
        Animal.name="tiger";
        
        
       Animal.showAnimalDetails();
       Animal.showAnimalDetails();
        
        System.out.println("Animal name"+Animal.name);
         System.out.println("Animal name"+Animal.name);
    }
}
