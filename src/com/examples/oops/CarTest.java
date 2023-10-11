package com.examples.oops;

public class CarTest {
    public static void main(String[] args) {
        Car car= new Car();
        car.name = "BMW";
        car.Model="X5";
        car.ModelYear=2023;

        System.out.println("Name of the Car: "+car.Carname());
        System.out.println("Model of the Car: "+car.CarModel());
        System.out.println("Year of the Car: "+car.CarModelYear());


        SportsCar sportscar= new SportsCar();
        sportscar.name="Ferrari";
        sportscar.Model="488 GTB";
        sportscar.ModelYear=2023;
        sportscar.engine="V16";
        sportscar.speed=450;
        sportscar.horsepower=600;

        System.out.println(" ");
        System.out.println("Name of the SportsCar: "+sportscar.Carname());
        System.out.println("Model of the SportsCar: "+sportscar.CarModel());
        System.out.println("Year of the SportsCar: "+sportscar.CarModelYear());
        System.out.println("Name of the SportsCar Engine Name: "+sportscar.Engine());
        System.out.println("Top Speed of the SportsCar: "+sportscar.Speed());
        System.out.println("HorsePower of the sportsCar: "+sportscar.Horsepower());


    }
}
