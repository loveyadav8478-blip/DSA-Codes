package Stacks;
import java.util.*;
public class BalancedParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        System.out.println(isBalanced(s));
    }

    private static boolean isBalanced(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch=='(') {
                st.push(')');
            }else if(ch=='{'){
                st.push('}');
            } else if (ch=='[') {
                st.push(']');
            }else if(st.isEmpty() || st.pop()!=ch){
                return false;
            }
        }
         return true;
    }
}
