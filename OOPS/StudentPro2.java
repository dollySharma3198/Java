import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    String Graduation;
    float fee;

    void inputData() {
        System.out.println("-----------Enter Details-----------");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the Roll No. :");
        rollNo = sc.nextInt();
        System.out.print("enter the Name :");
        name = sc.next();
        System.out.print("enter the Graduation :");
        Graduation = sc.next();
        System.out.print("enter the fee :");
        fee = sc.nextFloat();
    }

    void showDetails() {
        System.out.println("-----------Student Details-------------");
        System.out.println("Roll No. :" + rollNo);
        System.out.println("Name :" + name);
        System.out.println("Degree :" + Graduation);
        System.out.println("Fees :" + fee);
    }
}

public class StudentPro2 {

    public static void main(String[] args) {

        // Student s1=new Student();
        // s1.inputData();
        // s1.showDetails();

        // Student s2=new Student();
        // s2.inputData();
        // s2.showDetails();

        Student stu[] = new Student[2];

        for (int i = 0; i < stu.length; i++) {

            stu[i] = new Student();
            stu[i].inputData();
            stu[i].showDetails();
        }

    }
}



