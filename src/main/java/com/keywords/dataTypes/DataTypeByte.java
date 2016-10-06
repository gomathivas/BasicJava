package com.keywords.dataTypes;

/**
 * Created by gpunyakoti on 10/6/2016.
 */
public class DataTypeByte {
    byte value1 = 50;
    byte value2 = (byte) -80;

    void sum() {
        byte sum = (byte) (value1 + value2);
        System.out.println("The Byte Value is : " + sum);
    }
}
