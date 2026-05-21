package Stacks;
import java.util.Stack;
public class PostfixToInfix {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        String s = "1234-*+";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int asci = (int)ch;
            if(asci>= 48 && asci<=57){
                st.push(ch+"");
            }
            else{
                String v2 = st.pop();
                String v1 = st.pop();
                char o = ch;
                String Infix = v1+o+v2;
                st.push(Infix);
            }
        }
        System.out.println(st.peek());
    }
//public static void main(String[] args) {
//    Stack<String> st = new Stack<>();
//    String s = "+-95/*346";
//    for (int i = s.length()-1; i >= 0; i--) {
//        char ch = s.charAt(i);
//        int asci = (int)ch;
//        if (asci >= 47 && asci <=57) {
//            st.push(ch+"");
//        }else{
//            String v2 = st.pop();
//            String v1 = st.pop();
//            char o = ch;
//            String Infix = "(" + v1 + o + v2 + ")";
//            st.push(Infix);
//        }
//    }
//    System.out.println(st.peek());
//}
}
