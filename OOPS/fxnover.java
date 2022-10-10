class Test8
{
    void showDetails()
    {
        System.out.println("no values sent by user");
    }
    void  showDetails(int num)
    {
        System.out.println("u gave integer value "+num);
    }
    
    void  showDetails(char ch)
    {
        System.out.println("u gave character value "+ch);
    }
    
    void  showDetails(float f)
    {
        System.out.println("u gave float value "+f);
    }
    
}
public class fxnover {

    public static void main(String[] args) {
        
        Test8 t8=new Test8();

        t8.showDetails();
        t8.showDetails(45);
        t8.showDetails('$');
        t8.showDetails(67.8f);

    }
}