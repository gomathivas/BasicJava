package com.keywords.booleanKeyword;

/**
 * Created by gpunyakoti on 10/6/2016.
 */
public class Person {

    public Person(int age) {
        this.age = age;
    }

    private int age;

    public boolean isYoung(){
        if(this.age<30){
            return true;
        }
        return false;
    }


    public static void main(String args[]){
        Person pyoung = new Person(25);
        Person pold = new Person(50);
        System.out.println("pyoung is young :"+pyoung.isYoung());
        System.out.println("pold is young :"+pold.isYoung());

    }
}
