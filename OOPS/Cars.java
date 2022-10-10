package com.factory.carfact;
import com.factory.enginefact.Engines;

// public class Cars //gives error when we use num(protected member of Engines)
public class Cars extends Engines
{
    public int wheels=4;
    // Engines e=new Engines();//Has-a
    public void startCar()
    {
        Engines e=new Engines();//Uses-a
        e.startEngine();
        System.out.println("Starting the Car of "+wheels+" wheels");

        // System.out.println(e.price);
        // System.out.println(e.num); //it will give an Error that protected access in Engines
        System.out.println(num);
    } 
}