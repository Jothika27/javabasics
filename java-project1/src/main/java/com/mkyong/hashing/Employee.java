package com.mkyong.hashing;

public class Employee {
    int age;
    String name;
    String rollNo;
    
    public Employee(int age, String name,String rollNo) {
        this.age = age;
        this.name = name;
        this.rollNo=rollNo;
    }

    // @Override
    // public int compareTo(Employee o) {
    //    if(age==o.age)
    //       return 0;
    //    else if(age>o.age)
    //      return -1;
    //     else
    //       return 1;
    // }

    @Override
    public String toString() {
        return "Employee [age=" + age + ", name=" + name + ", rollNo=" + rollNo + "]";
    }
    
}
