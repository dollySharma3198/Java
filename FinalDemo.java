// final class Father  //we cant use final in parent class aslo in constructor of parent class
class Father
{
    // final Father()  {    } //error
    // final void Fight() {   }
}
class Child extends Father
{
    // void Fight(){    }
}
class Main //FinalDemo 
{
    public static final void main(String args[])
    {
        final float PI=3.14f;
        // PI=56.8f;
    }
}
