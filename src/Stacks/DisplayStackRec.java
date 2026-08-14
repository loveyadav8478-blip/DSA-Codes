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
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int n = temperatures.length;
        int[] ans = new int[n];
        for(int i = 0; i<n; i++) st.push(temperatures[i]);
        for(int i = 0; i<st.size(); i++) System.out.print(st.get(i)+" ");
        for(int i = 0; i<n ;i++){
            boolean bool = false;
            int count = 1;
            for(int j = i+1; j<st.size() ;j++){
                if(st.get(j)>temperatures[i]){
                    bool = true;
                    break;
                }
                else{
                    count++;
                }
            }
            st.pop();
            ans[i] = bool ? count : 0;
        }

//        for(int i = 0; i< st.size(); i++){
//            System.out.print(st.get(i));
//        }
//        displayRevRec(st);
//        System.out.println();
//        System.out.println(st);
//        reverse(st);
//        System.out.println(st);
    }
}
