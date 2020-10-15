package com.company;


public class Solution {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 50;
        person1.speak();
        Person person2 = new Person();
        person2.name = "Volodymyr";
        person2.age = 20;
        person2.sayHello();


    }
}

class Person {
    // Дані (поля)
    // Дії (методи)
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + "," + " I'm " + age + " years old!");
        }
    }
        void sayHello() {
            System.out.println("Hello!");

        }

}