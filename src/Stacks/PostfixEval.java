package Stacks;
import java.util.Stack;
public class PostfixEval {
    public static void main(String[] args) {
        String s = "953+4*6/-";
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int asci = (int)ch;
            if(asci>=48 && asci<=57) st.push(asci-'0');
            else{
                int v2 = st.pop();
                int v1 = st.pop();
                if(ch == '+') st.push(v1+v2);
                if(ch == '-') st.push(v1-v2);
                if(ch == '*') st.push(v1*v2);
                if(ch == '/') st.push(v1/v2);
            }
        }
        System.out.println(st.peek());
    }
}
