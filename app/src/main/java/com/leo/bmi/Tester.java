package com.leo.bmi;

import com.leo.bmi.hello.Person;
import com.leo.bmi.hello.Student;

public class Tester {
    public static void main(String[] args) {
        Student stu = new Student("001", "Hank", 60, 80);
        Student stu1 = new Student("001", "Hank", 30, 70);
        stu.print();
        stu1.print();
/*
        stu.setId("001");
        stu.setName("Hank");
        stu.setMath(60);
        stu.setEnglish(80);
*/

//        System.out.println("Hello World");
/*        Person person = new Person();
        person.hello();
        person.hello("Leo");
        person.setWeight(66);
        person.setHeight(1.7f);
        System.out.println(person.bmi());*/

    }

}
