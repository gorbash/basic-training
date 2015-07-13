package com.mot.training.control;


class WhileDemo {
    public static void main(String[] args) {
        countTo(10);
    }

    private static void countTo(int countTo) {
        int count = 1;
        while (count <= countTo) {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}
