package com.mot.training.examplePackage;

/**
 * Created by gorbash on 11.07.15.
 */
public class ArraysExample {

    public static void main(String[] args) {
        int[] array = new int[10];
        Integer[] array2 = new Integer[]{3, 4, 5, 6};

        Object genericRef = array;

        Object[] a = array2;
        a[2] = new Integer(3);

        for (Object o : a)
            System.out.println(o);


        varArgsMethod("fibonacci", 1, 1, 2, 3, 5, 8);
    }


    public static void varArgsMethod(String tag, Integer... elements) {
        System.out.print(tag + ": ");
        for (Integer el : elements) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
