package com.company.Problem4;

import com.company.Problem3.Problem3;

import java.util.ArrayList;
import java.util.List;

//public class Problem4 {
//
//    public List<String> fizzBuzz(int n) {
//        List<String> arr = new ArrayList<>();
//
////        int pr = 0;
////        for (int i = 1; i <= n; i++) {
////
////            if (i % 3 == 0) {
////                pr = 1;
////                if (i % 5 == 0) {
////                    pr = 3;
////                }
////            } else {
////                if (i % 5 == 0) {
////                    pr = 2;
////                }
////            }
////
////            switch (pr){
////                case 0:
////                    arr.add(String.valueOf(i));
////                    break;
////                case 1:
////                    arr.add("Fizz");
////                    break;
////                case 2:
////                    arr.add("Buzz");
////                    break;
////                case 3:
////                    arr.add("FizzBuzz");
////                    break;
////            }
////            pr = 0;
////        }
////        return arr;
//
//
//    }






public class Problem4 {

    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) arr.add("FizzBuzz");
            else {
                if (i % 3 == 0) arr.add("Fizz");
                else if (i % 5 == 0) arr.add("Buzz");
                else arr.add(String.valueOf(i));
            }

            return arr;
        }
        return arr;
    }

    public static void main(String[] args) {
        Problem4 problem = new Problem4();
        String arr = String.valueOf(problem.fizzBuzz(15));
        System.out.println("");

    }
}
