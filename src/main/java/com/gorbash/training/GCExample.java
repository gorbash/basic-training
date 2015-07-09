package com.gorbash.training;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by gorbash on 09.07.15.
 */
public class GCExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Waiting for visualVM");
        Thread.sleep(10000);
        System.out.println("starting allocation...");
        perf();
    }

    private static void perf() throws InterruptedException {
        List<Long> list = new LinkedList<Long>();
        Long result =  new Long(0);
        for (long i = 0; ; i++) {
            Long nLong = new Long(i);
            result += nLong;

            list.add(nLong);

            if (i%100000 == 0) {
                System.out.println(i);
                Thread.sleep(50);
            }
        }
    }
}
