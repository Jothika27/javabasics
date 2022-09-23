package com.oops.practice;

public class LocalInner {
        int x=10;
        public void display(){
          class Inner{
             public void msg(){
                x=45;
                System.out.println("Local Inner Class "+x);
             }
          }
          Inner i=new Inner();
          i.msg();
          System.out.println("Outer class "+x);
        }
   
}
