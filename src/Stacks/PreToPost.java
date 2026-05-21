package Stacks;
import java.util.Stack;
public class PreToPost {
    public static void main(String[] args) {
        String s = "+-95/*346";
        Stack<String> st = new Stack<>();
        for (int i = s.length()-1; i >= 0; i--) {
            char ch = s.charAt(i);
            int asci = (int)ch;
            if(asci>=48 && asci<=57) {
                String t = ""+ch;
                st.push(t);
            }
            else{
                String v1 = st.pop();
                String v2 = st.pop();
                char o = ch;
                String Postfix = v1+v2+o;
                st.push(Postfix);
            }
        }
        System.out.println(st.peek());
    }
}
