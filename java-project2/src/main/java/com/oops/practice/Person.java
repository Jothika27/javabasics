package com.oops.practice;

public class Person {
   private int idNo;
   private String name;
   private float weight;

public Person(int idNo, String name, float weight) {
    this.idNo = idNo;
    this.name = name;
    this.weight = weight;
}

public int getIdNo() {
    return idNo;
}
public void setIdNo(int idNo) {
    this.idNo = idNo;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public float getWeight() {
    return weight;
}
public void setWeight(float weight) {
    this.weight = weight;
}

@Override
public String toString() {
    return "Person [idNo=" + idNo + ", name=" + name + ", weight=" + weight + "]";
}
    
}
