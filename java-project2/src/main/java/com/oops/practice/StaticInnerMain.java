package com.oops.practice;

import com.oops.practice.StaticInner.InnerIn;

public class StaticInnerMain {
    public static void main(String[] args) {
        StaticInner.InnerIn i=new InnerIn();
        i.display();
        System.out.println(StaticInner.x);
    }
}
