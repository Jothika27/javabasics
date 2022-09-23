package com.first.hashing;

public class Car implements Vehi{
    String car_Model;
    String car_color;
    int speed;
    public Car(String car_Model, String car_color, int speed) {
        this.car_Model = car_Model;
        this.car_color = car_color;
        this.speed = speed;
    }
    public void start() {
        System.out.println("Car starts by using key");    
    }
    public void stop() {
        System.out.println("Car stops by using key");        
    }
    public static void vehi_break(){
        System.out.println("Car break");
    }
   
    @Override
    public String toString() {
        return "Car [car_Model=" + car_Model + ", car_color=" + car_color + ", speed=" + speed + "]";
    }
    /*@Override
    public void start() {
        System.out.println("Car starts by using key");
        
    }
    @Override
    void stop() {
        System.out.println("Car stops by using key");

    }
     public void speed(int speed){
        //super.speed();
        System.out.println("Car Speed method "+speed);
    }
    */

}
