package com.first.hashing;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String names[]={"anu","jo","prakash","sozha"};
        for (int i=0;i<3;i++){
           if(names[i].equals("jo")){
            names[i]=names[i].toUpperCase();
           }
            System.out.println(names[i]);
        }
        sc.close();
    }
}
