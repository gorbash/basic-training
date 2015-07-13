package com.mot.training.control;


public class ForExample {


    public static void main(String[] args) {
        String[] words = {"Twas", "brillig,", "and", "the", "slithy", "toves",
                "Did", "gyre", "and", "gimble", "in", "the", "wabe:",
                "All", "mimsy", "were", "the", "borogoves,",
                "And", "the", "mome", "raths", "outgrabe."};

        oldFor(words);

//        enhancedFor(words);

//        inifiniteLoop();

//        breakAndContinue();


    }

    private static void inifiniteLoop() {
        for (; ; ) {
            System.out.println("In infinite loop!");
            //        break;
        }
    }

    private static void oldFor(String[] words) {
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }

    private static void enhancedFor(String[] words) {
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }


    private static void breakAndContinue() {

        out:
        for (int i = 0; i < 3; i++) {
            System.out.println("In outer loop: " + i);
            for (int j = 0; j < 4; j++) {
                if (j == 2)
                    continue;

                if (i * j == 6) {
                    System.out.println("breaking outside!");
                    break out;
                }

                System.out.println("In inner loop: " + j);

            }
        }
    }

}
