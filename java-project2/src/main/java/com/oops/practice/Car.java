
package com.oops.practice;

public class Car  {
    public static void main(String[] args) {
        Vechical vechical=new Vechical() {
            public String stop(String s) {
                return s;      
            }
        };
        System.out.println(vechical.stop("Jo"));
        Vechical d2=(s)->{  
            return s; 
        };  
       System.out.println(d2.stop("String")); 
       
               
    }   
}
