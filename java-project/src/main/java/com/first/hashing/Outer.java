package com.first.hashing;

public class Outer {
 public  int rollNo;
 public void display(){
    rollNo=45;
      class Inner{
            void msg(){  
                rollNo=55;
                System.out.println("inner class "+rollNo);
            }
        }
        Inner i=new Inner();
        i.msg();
        System.out.println(rollNo);
    }

    public Outer(int rollNo) {
        this.rollNo = rollNo;
    }
    @Override
    public String toString() {
        return "Outer [rollNo=" + rollNo + "]";
    }
    
}
