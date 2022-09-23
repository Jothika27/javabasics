package com.oops.practice;

public class MemberInner {
    public int x=10;
    public class Inner{
      void display(){
        x=56;
        System.out.println("Member inner class "+x);
      }
    }
    public void msg(){
      System.out.println("Member inner");
    }
}
