package com.first.hashing;

public class CarTest {
    public static void main(String[] args) {
        Car c=new Car("lambohini", "Black", 1000);
        Car v=new Car("Audi", "Black", 800);
        Car.vehi_break();
        Vehi.vehi_break();
        c.print();
        System.out.println(c);
        System.out.println(v);
        // c.start();
        // c.stop();
        // v.start();
        // v.stop();
        // c.speed(500);
        
    }
}
