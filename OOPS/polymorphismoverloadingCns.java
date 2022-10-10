class Car 
{
    String model;
    float speed;
    String color;
    
    Car() 
    {
        System.out.println("creating a car with default parameters");
        color="Green";
        model="alto 800";
        speed=50.8f;
    }
    Car(String model) 
    {
        System.out.println("setting model of car");
        this.model=model;
    }
    Car(float speed,String color) 
    {
        System.out.println("setting speed and color of a car ");
        this.speed=speed;
        this.color=color;
    }
    Car(String model, float speed,String color) 
    {
        System.out.println("setting model,color and speed of a car");
        this.model=model;
        this.speed=speed;
        this.color=color;
    }
    void ShowDetails() 
    {
        System.out.println("model:" + model);
        System.out.println("speed:" + speed);
        System.out.println("color:" + color);
    }
}

public class polymorphismoverloadingCns 
{
    public static void main(String[] args) 
    {
        Car n1=new Car();
        n1.ShowDetails();

        Car c2=new Car(150.8f, "white");
        c2.ShowDetails();
        Car c3=new Car("lamborgini", 150, "White");
        c3.ShowDetails();
    }
}
