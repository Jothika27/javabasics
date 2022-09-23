package com.first.hashing;
public class Employee {
    private int employeeId;
    private String firstname;
    private char lastName;
    private double salary;
    private String dob;
    private boolean activeStatus;

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Non Static Bloack");
    }

    public Employee(int employeeId, String firstname, char lastName, double salary, String dob, boolean activeStatus) {
        this(30015,"ammu");
        this.employeeId = employeeId;
        this.firstname = firstname;
        this.lastName = lastName;
        this.salary = salary;
        this.dob = dob;
        this.activeStatus = activeStatus;    
    }
    
    public Employee(int employeeId, String firstname) {
        this();
        this.employeeId = employeeId;
        this.firstname = firstname;
        System.out.println("2 parameter constructor");
    }
    
    private Employee() {
      System.out.println("no argument constructor without this()");
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public char getLastName() {
        return lastName;
    }
    public void setLastName(char lastName) {
        this.lastName = lastName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public boolean isActiveStatus() {
        return activeStatus;
    }
    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public void presentEmployee(){
        if(activeStatus==true){
            System.out.println("the employee joined");
        }
        else{
            System.out.println("the employee was not joined");
        }
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
        Employee emp = (Employee) obj;
        return (emp.employeeId == this.employeeId && emp.firstname == this.firstname && emp.lastName==this.lastName && emp.salary==this.salary&&emp.dob==this.dob&&emp.activeStatus==this.activeStatus);
    }
    @Override
    public int hashCode() {
      
        return this.employeeId;
    }
    @Override
    public String toString() {
        return "Employee [activeStatus=" + activeStatus + ", dob=" + dob + ", employeeId=" + employeeId + ", firstname="
                + firstname + ", lastName=" + lastName + ", salary=" + salary + "]";
    }
    
}
