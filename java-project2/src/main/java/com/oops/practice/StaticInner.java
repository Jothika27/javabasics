package com.oops.practice;

public class StaticInner {
    static int x=10;
    static class InnerIn{
        void display(){
            x=67;
            System.out.println("Static Inner class "+x);
        }
    }
}
