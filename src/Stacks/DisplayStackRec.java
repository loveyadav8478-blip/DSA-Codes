package Stacks;
import java.util.*;
public class DisplayStackRec {
    public static void displayRevRec(Stack<Integer> st){
        if (st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayRevRec(st);
        st.push(top);
    }
    public static void displayRec(Stack<Integer> st){
        if (st.isEmpty()) return;
        int top = st.pop();
        displayRec(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void pushAtBottom(Stack<Integer> st, int x){
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,x);
        st.push(top);
    }
    public static void removeFromIdx(Stack<Integer> st, int idx){
        Stack<Integer> gt = new Stack<>();
        while(st.size()>idx) {
            gt.push(st.pop());
        }
        st.pop();
        while(!gt.isEmpty()){
            st.push(gt.pop());
        }
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()==1) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st,top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
//        displayRevRec(st);
//        System.out.println();
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
