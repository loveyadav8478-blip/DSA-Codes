package Stacks;
import java.util.*;
public class DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> rt = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        while(!st.isEmpty()){
            rt.push(st.pop());
        }
        while(!rt.isEmpty()){
            int n = rt.pop();
            System.out.print(n+" ");
            st.push(n);
        }
    }
}
