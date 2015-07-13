package com.mot.training.control;

class IfElseDemo {
    public static void main(String[] args) {

        int testscore = 40;

        ifElse(testscore);

        System.out.println(getResult(testscore));
    }


    private static void ifElse(int testscore) {

        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }


    private static String getResult(int score) {
        return score >= 60 ? "PASSED" : "FAILED";
    }
}
