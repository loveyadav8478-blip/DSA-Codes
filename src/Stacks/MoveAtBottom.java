package Stacks;
import java.util.*;
public class MoveAtBottom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        int idx = 4;
        int x = 55;
        while(st.size()>idx){
            ans.push(st.pop());
        }
        st.push(x);
        while(!ans.isEmpty()){
            st.push(ans.pop());
        }
        System.out.println(st);
//        int x = sc.nextInt();
//        st.push(x);
//        while(!ans.isEmpty()){
//            st.push(ans.pop());
//        }
//        System.out.println(st);
    }
}
