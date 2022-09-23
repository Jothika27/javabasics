package com.first.hashing;

abstract class Vehical {   
    abstract void start();
    abstract void stop();
    public  void speed(){
        System.out.println("Vehical Speed method");
    }
    static{
        System.out.println("Static Block");
    }
    public static void vehi_break(){
     System.out.println("Vehical break");
    }
}
