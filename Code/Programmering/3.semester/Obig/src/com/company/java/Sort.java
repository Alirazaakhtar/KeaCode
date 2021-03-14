package com.company.java;

import java.util.ArrayList;

public class Sort {

    private static Long startTime;

    public static void main(String[] args) {




        int[] arr1 = {1,2,3,4,5}; // Best case
        int[] arr2 = {1,5,3,4,2}; // Avg case
        int[] arr3 = {5,4,3,2,1}; // Worst case


        startTime();

        for(int i = 0; i < sort(arr2).length; i++){
            System.out.println(sort(arr2)[i]);
        }

        showTime();
    }

    // Big O ignorer konstanter




    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) { // O(n)
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) { //n - 1 => O(n)
                if (array[j] < min) { // O(n * (n-1)) = O(n^2 - n*1) => O(n^2)
                    min = array[j];
                    minId = j;
                }
            }
            // swapping
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }

        return array;
    }

    public static void startTime(){

        startTime = System.nanoTime();

    }

    public static void showTime(){
        System.out.println("Time is ns: " + (System.nanoTime() - startTime));
    }


    public static void remove(int num){

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<3; i++ ){
            for (int j = 0; j < 10 ; j++) {
                list.add(j);
            }
        }


        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == num){
                list.remove(i);
            }
        }

        System.out.println(list);
    }


}
