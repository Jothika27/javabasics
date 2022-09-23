package com.stream.hashing;

public class Employee {
    private String name;
    private String employee_id;
    private String dob;
    private float weight;
    private int age;
    
//    public Employee(String name, String employee_id, String dob, float weight, int age) {
//         this.name = name;
//         this.employee_id = employee_id;
//         this.dob = dob;
//         this.weight = weight;
//         this.age = age;
//     }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmployee_id() {
        return employee_id;
    }
    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Employee [age=" + age + ", dob=" + dob + ", employee_id=" + employee_id + ", name=" + name + ", weight="
                + weight + "]";
    }
    
}
