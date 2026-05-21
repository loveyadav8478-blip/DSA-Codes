package Stacks;
import java.util.*;
public class InfixToPostfix {
    public static void main(String[] args) {
        String s = "A+(B*C-(D/E^F)*G)*H";//(9-(((5+3)*4)/6))
        System.out.println(s);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int asci = (int)ch;
            if(asci >= 48 && asci <= 57) {
                String str = ""+ch;
                val.push(str);
            }
            else if(op.isEmpty() || op.peek() == '(' || ch == '(') op.push(ch);
            else if (ch==')') {
                while (op.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = v1+v2+o;
                    val.push(t);
                }
                op.pop();
            }
            else{
                if (ch == '+' || ch == '-') {
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = v1+v2+o;
                    val.push(t);
                    op.push(ch);
                }
                if (ch == '*' || ch == '/'){
                    if (op.peek() == '*' || op.peek() == '/') {
                        //work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = v1+v2+o;
                        val.push(t);
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(val.size()>1){
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = v1+v2+o;
            val.push(t);
        }
        String prefix = val.pop();
        System.out.println(prefix);
    }
}
