package Stacks;
import java.util.Stack;
public class PrefixEvel {
    public static void main(String[] args) {
        String s = "+-95/*346";
        Stack<Integer> st = new Stack<>();
        for (int i = s.length()-1; i >= 0; i--) {
            char ch = s.charAt(i);
            int asci = (int)ch;
            if(asci>=48 && asci<=57) st.push(asci-'0');
            else{
                int v1 = st.pop();
                int v2 = st.pop();
                if(ch == '+') st.push(v1+v2);
                if(ch == '-') st.push(v1-v2);
                if(ch == '*') st.push(v1*v2);
                if(ch == '/') st.push(v1/v2);
            }
        }
        System.out.println(st.peek());
    }
}
