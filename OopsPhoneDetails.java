// phone  details ,blue print 
//error main.java 
class Phone
{
    String color;//instance variables
    float dispSize;
    String modelNo;
    void call()
    {
        System.out.println("we can call");
    }
    void showPhoneDetails()
    {
        System.out.println("Model No. :"+modelNo);
    }
}
public class Main.java{
    public static void main(String[] args) {
        Phone amanKaPhone=new Phone(); //instantiation
        Phone dollyKaPhone=new Phone(); //instantiation
        
        amanKaPhone.modelNo="Realme XT";
        dollyKaPhone.modelNo="Nokia 3310";

        amanKaPhone.showPhoneDetails();
        dollyKaPhone.showPhoneDetails();

        // System.out.println("aman's phone model No. "+amanKaPhone.modelNo);
        // System.out.println("dolly's phone model No. "+dollyKaPhone.modelNo);
    }
}
