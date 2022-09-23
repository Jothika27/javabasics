package com.first.hashing;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student student=new Student(12, "Jothika", "R", "27/04/2001");
        Student s=new Student(12, "Jothika", "R", "27/04/2001");
        System.out.println(student.equals(s));
        System.out.println(student);
        System.out.println(s);
        System.out.println(s.area(sc.nextInt()));
        sc.close();
    }
}
