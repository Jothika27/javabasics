package com.first.hashing;
public class App 
{
    static  int l=6 ;
    static  int b=5;
    static{
       System.out.println("Static block");
    }
    {
        System.out.println("non static block");
    }
    static void valChange( ){
        l=4;
        b=3;
    }
    static int area(int l,int b){
        return l*b;
    }
    
}
