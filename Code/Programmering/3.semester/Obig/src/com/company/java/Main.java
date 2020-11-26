package com.company.java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class Main {

    private static long startTime;
    private static int n = 10;

    private static int[] nums = IntStream.rangeClosed(0, n).toArray();


    public static void main(String[] args) {










//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(2,3);
//        map.put(2,4);
//        map.get(2); // hvor hurtig er denne?
//
//
//        Map<Integer, Integer> treemap = new TreeMap<>();
//
//        treemap.put(2,3);
//        treemap.put(3, 4);
//        treemap.put(4,5);
//        treemap.get(4);


                // s(nums, n);
                //binary(nums, n-1);


//        startTime();
//
//                if(binary(nums, n/2)){
//                    System.out.println(true);
//                }
//                else {
//                    System.out.println(false);
//                }
//
//        showTime();

        startTime();

        search(nums, n);

        showTime();

    }


    public static void search(int[] array, int key){

        for(int i = 0; i < array.length; i++){

            if(array[i] == key){
                System.out.println("Element found at index: " + i);
                return;
            }
        }

        System.out.println("Element not found");

    }

    private static boolean binary(int[] arr, int key){



        for(int i = 0; i < arr.length; i++){

            if(arr[i] == key){
                return true;
            }
        }


        return false;
    }


    public static void startTime(){

        startTime = System.nanoTime();

    }

    public static void showTime(){
        System.out.println("Time is ns: " + (System.nanoTime() - startTime));
    }
}
