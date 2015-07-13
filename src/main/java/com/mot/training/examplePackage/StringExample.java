package com.mot.training.examplePackage;


public class StringExample {
    public static void main(String[] args) {
        String s = "do cats eat bats?";
        String s1 = new String("Twas brillig, and the slithy toves");

//        System.out.println(s);
//
//        String substring = s.substring(8,11);
//        System.out.println(substring);
//        System.out.println(s);
//
//        System.out.println(s1.length());
//
//        System.out.println("alice".length());
//
//        String title = "Alice " + "in " + "Wonderland";
//
//        System.out.println(title);
//
//        System.out.println("answer for the meaning of life, universe and everything is " + 42);
//
//        System.out.println("1" + 2 + 3);
//
//        System.out.println(1 + "2" + 3);
//
//        System.out.println(1 + 2 + "3");
//
//        System.out.println(String.valueOf(1) + String.valueOf(2) + "3");
//
//        System.out.println(String.format("answer for the meaning of life, universe and everything is %d", 42));


        // building long strings
//        System.out.println(buildStringWith100Numbers());
//
//
//        System.out.println(buildStringWith100NumbersEfficiently());

    }

    private static String buildStringWith100NumbersEfficiently() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append(i);
        }
        return builder.toString();
    }

    private static String buildStringWith100Numbers() {
        String result = "";
        for (int i = 0; i < 100; i++) {
            result += i;
        }
        return result;
    }

}
