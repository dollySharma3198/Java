//Single inheritance
class Mammal
{
    String bloodType="Warm";
    String reproduceMethod="Birth";
    void showMammalProperty()
    {
        System.out.println("Blood Type :"+bloodType);
        System.out.println("Reproduce Method :"+reproduceMethod);
    }
}
class Human extends Mammal 
{
    int legsWalkOn=2;
    float weight=54;
    void showHumanDetails()
    {
        System.out.println("Walks on "+legsWalkOn+" legs");
        System.out.println("weight :"+weight);
        
    }
}
public class SingleInheritance {
public static void main(String[] args) 
{
    // Mammal m=new Mammal();
    // m.showMammalProperty();
    Human h=new Human();
    h.showMammalProperty();
    h.showHumanDetails();
}
}