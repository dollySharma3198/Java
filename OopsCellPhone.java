// CELLPHONE 

import java.util.Scanner;
 class cellPhone
{
    
    public void ring()
    {
        System.out.println("ringigng.....");
        
    }
    public void vibrate()
    {
        System.out.println("vibrating.....");
        
    }
    public void callFriend()
    {
        System.out.println("calling to dolly .....");
        
    }
}
class Main
 {
    public static void main(String[] args)
    {
        cellPhone samsung=new cellPhone();
        samsung.callFriend();
        samsung.vibrate();
        samsung.ring();
    }
}
