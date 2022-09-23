package com.mkyong.hashing;

import java.util.List;

interface StudentDao{
    public void updateStudents();
    public void deleteStudents();
    public void addStudents();
    public List<Student> getAllStudents();
    public Student getStudent();
}
