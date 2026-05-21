package Hashmap;
import java.util.*;
public class New {
    public static void main(String[] args) {
        Map<Integer, Integer> m = new HashMap<>();
        int[] arr = new int[6];
        m.put(10,2);
        m.put(20,2);
        m.put(30,2);
        m.put(40,2);
        m.put(50,2);
        m.remove(50);
        System.out.println(m);
//        for(int val : arr){
//            System.out.print(val+" ");
//        }
//        System.out.println();
//        for(var v : m.entrySet()){
//            System.out.print(v+" ");
//            System.out.print(v.getKey()+" ");
//            System.out.print(v.getValue()+" ");
//            System.out.println(v.getClass());
//        }
    }
}
