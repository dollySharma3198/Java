import java.util.Scanner;

class percentage_1 {
    public static void main(String[] args) {
       float total=0;
       System.out.println("enter the CBSE percentage here");
       Scanner input=new Scanner(System.in);
       System.out.println("enter the toatal subject  here");
       int total_marks=input.nextInt();
       System.out.println("enter the marks of subject 1");
       float s1=input.nextFloat();
       total=total+s1;
       System.out.println("enter the marks of subject 2");
       float s2=input.nextFloat();
       total=total+s2;
       System.out.println("enter the marks of subject 3");
       float s3=input.nextFloat();
       total=total+s3;
       System.out.println("enter the marks of subject 4");
       float s4=input.nextFloat();
       total=total+s4;
       System.out.println("enter the marks of subject 5");
       float s5=input.nextFloat();
       total=total+s5;
      float grandTotal=total/100*(total_marks*5);
       System.out.println("your total percentage="+grandTotal+"percent");
    }
}