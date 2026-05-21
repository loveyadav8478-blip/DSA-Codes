package com.OOPSinJava.coreJava;

import java.util.*;

public class ArrayList {


    public static class Arraylist{
        static int[] arr = new int[3];
        int idx = 0;
        int size = 0;

        public void add(int ele){
            if(size == arr.length){
                int[] brr = Arrays.copyOf(arr,arr.length*2);
//                arr = new int[brr.length];
//                arr = Arrays.copyOf(brr,brr.length);
                arr = brr;
            }
            arr[idx] = ele;
            idx++;
            size++;
        }
        public void set(int idx, int ele){
            arr[idx] = ele;
        }
        public  void print(){
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }


    public static void main(String[] args) {
        Arraylist arr = new Arraylist();
        arr.add(1);
        arr.add(32);
//        System.out.println(arr.size);
        arr.add(4);
        arr.add(3);
//        System.out.println(arr.size);
        arr.set(1,2);
        arr.print();
    }
}
