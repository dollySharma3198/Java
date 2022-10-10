class Father {
    void child() {
        System.out.println("Hii my name is MR RAKESH");
    }

    void fatherFxn() {
        System.out.println("i am doing my bussiness");
    }
}

class Son extends Father {
    void child() {
        System.out.println("Hii my name is dolly");
    }

void childFxn()
{
    System.out.println("i m doing my own bussiness");

}
}
public class OverridingFather{
public static void main(String[] args) {
Father f1=new Father();
f1.child();
f1.fatherFxn();
Son s1=new Son();
s1.child();
s1.childFxn();

////overriding or dynamic polymorphism 
Father f1Father=new Son();
f1Father.child();

}

}

