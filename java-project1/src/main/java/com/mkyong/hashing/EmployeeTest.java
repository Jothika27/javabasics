package com.mkyong.hashing;

// import java.util.ArrayList;
// import java.util.Collections;
//  //import java.util.Arrays;
// import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0]=new Employee(25, "Jo", "17f212");
        employees[1]=new Employee(21, "Prakash", "17f209");
        employees[2]=new Employee(23, "Sozha", "17f205");
        
        for(int i=0;i<employees.length;i++){
            System.out.println(employees[i]);
        }
       // Arrays.sort(employees);
      //  Arrays.sort(employees,new AgeComparator());

        System.out.println();
        for(int i=0;i<employees.length;i++){
            System.out.println(employees[i]);
        }

    }
}
