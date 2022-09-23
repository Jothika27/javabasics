package com.mkyong.hashing;

import java.util.ArrayList;
// import java.util.Arrays;
//import java.util.List;
import java.util.Collections;

public class TeacherTest {
    public static void main(String[] args) {

        Teacher[] teachers=new Teacher[4];
        teachers[0]=new Teacher("Jothika", "17f212", 21);
        teachers[1]=new Teacher("Sozharaja", "17f211", 19);
        teachers[2]=new Teacher("Prakash", "17f205", 16);
        teachers[2]=new Teacher("Anushya", "17f209", 28);
    
        ArrayList<Teacher> l=new ArrayList<Teacher>();
       for (Teacher i: teachers) {
              l.add(i);
       }
       Collections.sort(l, new  AgeComparator() );
       System.out.println(l);
    }
}
