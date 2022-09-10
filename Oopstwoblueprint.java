//two blue print 

import java.util.Scanner;
class Student{
    String name;
    int age;
    int height;
    String color;
     
     public void printinfo()
     {
         System.out.println("name of the student-1 :"+name);
         System.out.println("age of the student-1 :"+age);
         System.out.println("height of the student-1 :"+height);
         System.out.println("color of the student-1 :"+color);
     }
}
public class Main
{
    public static void main (String args[]){
        Student s1= new Student();
        s1.name= "karan";
        s1.age  = 26;
        s1.height=5;
        s1.color="brown";
        s1.printinfo();
         Student s2= new Student();
         
       s2.name= "vijay";
        s2.age  = 26;
        s2.height=6.2f;
         s2.color="black";
        s2.printinfo();


        // Student s[]=new Student[10];
        
        // for(int i=0;i<10;i++)
        // {
        //     s[i]=new Student();
        //     System.out.println("age "+s[i].age);
        // }

    }
}
