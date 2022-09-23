package com.mkyong.hashing;

// import java.util.Arrays;

public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDaoImAl s=new StudentDaoImAl();
       // Student obj[]=s.getAllStudents();
        // System.out.println(Arrays.toString(s.getAllStudents()));
        System.out.println(s.getAllStudents());
        s.addStudents();
        s.deleteStudents();
        System.out.println(s.getStudent());   
        s.updateStudents();
       
    }
}
