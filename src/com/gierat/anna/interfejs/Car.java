package com.gierat.anna.interfejs;

import java.util.ArrayList;
import java.util.List;

public class Car implements Vehicle {
    public void stop(){
        System.out.println("Samochod stoi");
    }

    public void start (){
        System.out.println("Samochod jedzie");
    }

    public static void main(String[] args) {

        Vehicle samochod = new Car();
        Vehicle rower = new Bike();

        List<Vehicle> wszystkiePojazdy = new ArrayList<>();
        wszystkiePojazdy.add(samochod);
        wszystkiePojazdy.add(rower);



    }
}
