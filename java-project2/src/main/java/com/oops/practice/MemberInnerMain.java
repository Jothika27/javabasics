package com.oops.practice;

public class MemberInnerMain {
    public static void main(String[] args) {
        MemberInner m=new MemberInner();
        MemberInner.Inner i=m.new Inner();
        i.display();
        m.msg();
        System.out.println(m.x);
    }
}
