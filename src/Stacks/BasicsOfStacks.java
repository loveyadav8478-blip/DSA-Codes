package Stacks;
import java.util.*;
public class BasicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while(!st.isEmpty()){
            rt.push(st.pop());
        }
        System.out.println(rt);
        Stack<Integer> ans = new Stack<>();
        while(!rt.isEmpty()){
            ans.push(rt.pop());
        }
        System.out.println(ans);
    }
}
