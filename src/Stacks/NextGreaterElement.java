package Stacks;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;
public class NextGreaterElement {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,5,6,7};
//        Stack<Integer> st = new Stack<>();
//        int[] res = new int[arr.length];
//        int n = arr.length;
//        res[n-1]= -1;
//        st.push(arr[n-1]);
//        for (int i = n-2; i >= 0; i--) {
//            while(arr[i]>st.peek() && !st.isEmpty()){
//                st.pop();
//            }
//            if (st.isEmpty()) res[i] = -1;
//            else res[i] = st.peek();
//            st.push(arr[i]);
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            System.out.print(res[i]+" ");
//        }

        Stack<Character> st = new Stack<>();
        String s  = "abBAcC";
        System.out.println((int)s.charAt(5)-(int)s.charAt(4)==32);

    }
}
