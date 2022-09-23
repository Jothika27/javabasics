package com.mkyong.hashing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDaoImAl implements StudentDao{
    List<Student>  l;
    Student s;
   
    @Override
    public void addStudents() {
       System.out.println("**Add a Student**\n");
       s=new Student(17205, "Santhosh");
       l.add(s);
       System.out.println(l);
    }
   
    @Override
    public void updateStudents() {
        System.out.println("**update a purticular record**\n");
        String st="MR Universe";
        Student stu=l.get(0);
        stu.setRollNo(l.get(0).getRollNo());
        stu.setName(st);
        l.remove(0);
        l.add(0, stu);
       System.out.println(l);
    }

    @Override
    public void deleteStudents() {
        System.out.println("**delete a purticular Record**\n");
        l.remove(0);
        System.out.println(l);
    }

    @Override
    public List<Student> getAllStudents() {
        l=new ArrayList<Student>();
        System.out.println("**Adding  the Student**\n");
        s=new Student(17212, "Jo");
        l.add(s);
        s=new Student(17209, "Ganesh");
        l.add(s);
        s=new Student(17211, "Madhan");
        l.add(s);
        s=new Student(17210, "Ganesh");
        l.add(s);
        return l ;
    }

    @Override
    public Student getStudent() {
        Scanner sc=new Scanner(System.in);
        System.out.println("**Enter the index you want to get a single student**\n");
        int x=sc.nextInt();
        sc.close();
        return l.get(x);
    }

}
