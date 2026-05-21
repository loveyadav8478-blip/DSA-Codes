package Stacks;
import java.util.Stack;
public class PostToPre {
    public static void main(String[] args) {
        String s = "95-34*6/+";//+-95/*346
        Stack<String> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int asci = (int)ch;
            if(asci>=48 && asci<=57) {
                String t = ""+ch;
                st.push(t);
            }
            else{
                String v2 = st.pop();
                String v1 = st.pop();
                char o = ch;
                String Postfix = o+v1+v2;
                st.push(Postfix);
            }
        }
        System.out.println(st.peek());
    }
}
