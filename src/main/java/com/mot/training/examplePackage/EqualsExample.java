package com.mot.training.examplePackage;

/**
 * Created by gorbash on 11.07.15.
 */
public class EqualsExample {

    public static void main(String[] args) {

//        runEqualCheck(new Object(), new Object());
//        runEqualCheck( new ExampleObject(1), new ExampleObject(1));
//        runEqualCheck(new String("string a"), new String("string a"));
//        runEqualCheck("string a", "string a");
//        runEqualCheck(new Integer(100000), new Integer(100000));

//        Integer i1 = 2;
//        Integer i2 = 2;
//        runEqualCheck(i1, i2);


//        Integer i11 = 2000000;
//        Integer i21 = 2000000;
//
//        runEqualCheck(i11, i21);
    }





    private static void runEqualCheck(Object o1, Object o2) {
        System.out.println("---------------------------------------------");
        System.out.println("Comparing '" + o1 + "' and '" + o2 + "'");
        System.out.println("o1 == o2      : " + (o1 == o2));
        System.out.println("o1.equals(o2) : " + o1.equals(o2));
        System.out.println("---------------------------------------------");
    }
}
