package BuilderDesignPattern;

import java.util.*;
public class Student {
    int rollNo;
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;

    public Student(StudentBuilder builder){
        this.age = builder.age;
        this.rollNo = builder.rollNo;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
        this.subjects = builder.subjects;
        this.name = builder.name;
    }

     @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNo +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}   
