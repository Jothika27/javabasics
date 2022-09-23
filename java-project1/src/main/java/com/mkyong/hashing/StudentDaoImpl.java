package com.mkyong.hashing;

import java.util.Arrays;
import java.util.Scanner;

public class StudentDaoImpl /*implements StudentDao*/ {
    Student[] students=new Student[3];
    public StudentDaoImpl() {
        System.out.println("Implementation of StudentClass");
    }
    // @Override
    public void updateStudents() {
        System.out.println();
        System.out.println("Update a purticular record");
        for(int i=0;i<students.length;i++){
            if(students[i].getName()=="jo"){
                students[i].setName("Jothika");
            }
           } 
           System.out.println(Arrays.toString(students));
    }
    // @Override
    public void deleteStudents() {
        System.out.println();
       System.out.println("Delete a purticular Record");
       Student s[]=new Student[students.length];
       int k=0;
       for(int i=0;i<students.length;i++){
        if(students[i].getName()!="jo"){
           s[k]=students[i];
           k++;
        }
       }  
       System.out.println(Arrays.toString(s));
    }
    // @Override
    public void addStudents() {
        System.out.println();
        System.out.println("Add Student");
        students[2]=new Student(17205, "Santhosh");
        System.out.println(Arrays.toString(students));
    }
    // @Override
    public Student[] getAllStudents() {
        System.out.println();
        System.out.println("Get All Students Methode");
        students[0]=new Student(17212, "jo");
        students[1]=new Student(17209, "hari");
        return students;
    }
    // @Override
    public Student getStudent() {
        Scanner sc =new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the index no to get a student");
        Student s=new Student(0, " ");
        int n=sc.nextInt();
        for(int i=0;i<students.length;i++){
            if(i==n){
             s=students[i];
            }
        }
        sc.close();
        return s;
        
    }
    
}
