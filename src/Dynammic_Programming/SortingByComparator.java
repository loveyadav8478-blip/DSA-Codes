package Dynammic_Programming;

import java.util.*;

public class SortingByComparator {
    public static void main(String[] args) {
        Integer[] arr = {3,5,6,7,8,2,1,0};
//        Arrays.sort(arr);
        Arrays.sort(arr ,(a,b)-> Integer.compare(b,a));
        print(arr);
    }
    static void print(Integer[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
