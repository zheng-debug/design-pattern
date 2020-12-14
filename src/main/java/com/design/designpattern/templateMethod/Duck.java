package com.design.designpattern.templateMethod;

import lombok.Data;

import java.util.Comparator;

@Data
public class Duck implements Comparable, Comparator {
    public String name;

    public int age;

    public Duck(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Duck otherDuck = (Duck) o;
        if(otherDuck.age > this.age){
            return -1;
        }else if (otherDuck.age == this.age){
            return 0;
        }else if (otherDuck.age < this.age){
            return 1;
        }
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
