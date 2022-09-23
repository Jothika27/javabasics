package com.first.hashing;

public class MainA {
    public static void main(String[] output) {
        App a=new App();
        App app=new App();
        //static block will print only once
        System.out.println(a);
        System.out.println(app);
        // before changing the static variable
        System.out.println(App.l);
        System.out.println(App.b);
        // After changing the static variable by using static methode
        App.valChange();
        System.out.println(App.l);
        System.out.println(App.b);
        //static methode by passing the value
        System.out.println(App.area(5, 7));
        System.out.println(App.area(4,7));
    }
}
