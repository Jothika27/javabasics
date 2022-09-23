package com.first.hashing;
import java.util.Scanner;
public class PrintNamesNewLine {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=new String();
    s=s+sc.nextLine();
    System.out.println(s);
     String  str = "Exi bin sim";
    String[] splited = str.split("\\s+");
     for(int i=0;i<splited.length;i++){
        System.out.println(splited[i]);
    }
    sc.close();
   } 
}
