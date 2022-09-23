package com.oops.practice;

public class AnonimouseMain {
    public static void main(String[] args) {
        Anonimouse a=new Anonimouse() {
            void display(){
            System.out.println("Anonimouse  Class object creation");
            }
        };
        a.display();
    }
}
