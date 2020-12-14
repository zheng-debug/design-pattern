package com.design.designpattern.templateMethod;




import java.util.Arrays;

/**
 * 模板方法模式：
 *      1、在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中进行实现。
 *          模板方法可以在不更改算法结构的情况下，重新定义算法中的某些步骤。
 *      2、
 */
public class DuckSort {
    public static Duck[] ducks = {new Duck("压抑",10),
                            new Duck("亚尔", 23),
                            new Duck("睚三", 14),
                            new Duck("雅思", 16),
                            new Duck("亚乌", 34)};
    public static void main(String[] args) {
        System.out.println("排序前：");
        Arrays.stream(ducks).forEach(System.out::println);
        Arrays.sort(ducks);
        System.out.println("排序后：");
        Arrays.stream(ducks).forEach(System.out::println);
    }
}
