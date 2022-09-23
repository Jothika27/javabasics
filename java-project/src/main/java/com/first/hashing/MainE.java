package com.first.hashing;

public class MainE {
    public static void main(String[] args) {
        Employee e=new Employee(300156, "Anushiya", 'P', 23000.00,"25-06-2000",true);
        Employee employee =new Employee(30014, "Jothika", 'R', 16000.00,"2001/04/27",true);
        System.out.println(employee);
        System.out.println(e);
        System.out.println("constructor called");
        /*  employee.getDob();
        employee.getEmployeeId();
        employee.getFirstname();
        employee.getLastName();
        employee.getSalary();
        employee.isActiveStatus();
        employee.setActiveStatus(true);
        employee.setDob("25-06-2000");
        employee.setEmployeeId(300156);
        employee.setFirstname("Anushiya");
        employee.setLastName('P');
        employee.setSalary(23000.00);
        employee.presentEmployee();
        System.out.println(e.equals(employee));
        System.out.println(employee.hashCode());
        System.out.println(e.hashCode());*/
    }
}
