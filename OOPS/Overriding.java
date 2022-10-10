class Vehicle
{
    void accelerate()
    {
        System.out.println("hii i am accelerating the vehicle");
    }
    void vehicleFxn()
    {
        System.out.println("Hii i am a Vehicle");
    }
}
class Bike extends Vehicle
{
    void accelerate()
    {
        System.out.println("Hii i am accelarating the Bike");
    }
    
    void bikeFxn()
    {
        System.out.println("Hii i am a Bike");
    }
}
public class Overriding {
public static void main(String[] args) {
    

// Bike b=new Bike();
// b.accelerate();
// b.vehicleFxn();
// b.bikeFxn();

// Vehicle v=new Vehicle();
// v.accelerate();
// v.vehicleFxn();

//overriding or dynamic polymorphism 
Vehicle v2Vehicle=new Bike();
v2Vehicle.accelerate();// vehicle or bike ?
v2Vehicle.vehicleFxn();
// v2Vehicle.bikeFxn();

}
}
    
