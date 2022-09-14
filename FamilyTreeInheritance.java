//single inheritance 

class Grandfather
{
String name="Pyare lal sharma";
String color="brown";
float height=6.0f;
int son=3;

   void showGrandfatherDetails()
   {
       System.out.println("grandfather name: "+name);
       System.out.println("grandfather color: "+color);
       System.out.println("grandfather height: "+height);
       System.out.println("grandfather sons : "+son);
   }
}
 class Father extends Grandfather
 {
     String FatherName="Rakesh sharma";
    int son=2;
    String name ="Deepak sharma, manoj sharma";
    void showFatherDetails()
    {
        System.out.println("My father name is: "+FatherName);
        System.out.println("Sons of my father is: "+son);
        System.out.println("name of son's of my father: "+name);
    }
 }



public class Main
{
	public static void main(String[] args) {
		Grandfather g1=new Grandfather();
		g1.showGrandfatherDetails();
		Father g2=new Father();
		g2.showFatherDetails();
	}
}
