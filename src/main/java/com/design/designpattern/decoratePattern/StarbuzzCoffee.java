package com.design.designpattern.decoratePattern;

import java.io.*;

public class StarbuzzCoffee {
    public static void main(String[] args) {

        //测试coffee
        Beverage espressoMocha = new Espresso();
        espressoMocha = new Mocha(espressoMocha);
        System.out.println(espressoMocha.getDescription() + "," + espressoMocha.cost());

        //测试inputstream
        int c;
        try{
            InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("D:\\filesystem\\workSpace\\design-pattern\\src\\main\\java\\com\\design\\designpattern\\decoratePattern\\text.txt")));
            while((c = inputStream.read()) > 0){
                System.out.println((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
