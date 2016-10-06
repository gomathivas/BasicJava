package com.keywords.abstractKeyword;

/**
 * Created by gpunyakoti on 10/6/2016.
 */
public class Main {

    public static void main(String args[]){
        Airplane a = new Flight7C();
        a.takeOff();
        a.landing();
        PoliceCar p = new PoliceCar();
        p.drive();
        Car c = new PoliceCar();
        c.drive();

    }

}
