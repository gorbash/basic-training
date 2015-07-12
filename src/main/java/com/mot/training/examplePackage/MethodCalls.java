package com.mot.training.examplePackage;

/**
 * Created by gorbash on 11.07.15.
 */
public class MethodCalls {

    public static void main(String[] args) {
        ExampleObject obj = new ExampleObject(42);

        int v = 42;

        acceptInt(v);
//        acceptObject(obj);

        System.out.println("after " + v);
//        System.out.println("Object after " + obj);
    }


    public static void acceptInt(int value) {
        System.out.println("value accepted " + value);
        value = 100;
        System.out.println("value changed " + value);
    }

    public static void acceptObject(ExampleObject obj) {
        System.out.println("object reference accepted " + obj);
        obj = null;
//        obj.setField(100);
        System.out.println("object reference changed " + obj);
    }

}
