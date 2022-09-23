package com.mkyong.hashing;

public class Teacher {
    private String name;
    private String empId;
    private float age;
    public Teacher(String name, String empId, float age) {
        this.name = name;
        this.empId = empId;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public float getAge() {
        return age;
    }
    public void setAge(float age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Teacher [age=" + age + ", empId=" + empId + ", name=" + name + "]";
    }
    
}
