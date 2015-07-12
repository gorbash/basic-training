package com.mot.training.examplePackage;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mot on 09.07.15.
 */
public class GCExample {

    public static final int TEN_SECONDS = 10000;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Waiting for visualVM");
        Thread.sleep(TEN_SECONDS);
        System.out.println("starting allocation...");
        perfTest();
    }

    private static void perfTest() throws InterruptedException {
        List<Long> list = new LinkedList<Long>();
        Long result =  new Long(0);
        for (long i = 0; ; i++) {
            Long nLong = new Long(i);
            result += nLong;

//            list.add(nLong);

            if (i%100000 == 0) {
                System.out.println(i);
                Thread.sleep(50);
            }
        }
    }
}
