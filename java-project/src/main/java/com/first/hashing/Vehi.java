package com.first.hashing;
interface Vehi {
   public void start();
   public void stop();
   public static void vehi_break(){
   System.out.println("Vehical static methode ");
   }
   default void print(){
    System.out.println("Vehi print");
   }
}
