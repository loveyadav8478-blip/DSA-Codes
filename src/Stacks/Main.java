package Stacks;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        for(int i = 0; i< n; i++){
            char ch = s.charAt(i);
            if((int) ch >=48 && (int) ch <=57) val.push(ch-'0');
            else if(ch=='(') op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){
                    int b = val.pop();
                    int a = val.pop();
                    if(op.peek()=='*') val.push(a*b);
                    if(op.peek()=='/') val.push(a/b);
                    if(op.peek()=='+') val.push(a+b);
                    if(op.peek()=='-') val.push(a-b);
                    op.pop();
                }
                op.pop();
            }
            else{
                if(ch=='+' || ch=='-'){
                    int b = val.pop();
                    int a = val.pop();
                    if(op.peek()=='*') val.push(a*b);
                    if(op.peek()=='/') val.push(a/b);
                    if(op.peek()=='+') val.push(a+b);
                    if(op.peek()=='-') val.push(a-b);
                    op.pop();
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    int b = val.pop();
                    int a = val.pop();
                    if(op.peek()=='*') val.push(a*b);
                    if(op.peek()=='/') val.push(a/b);
                    op.pop();
                    op.push(ch);
                }
            }

            int ans = 0;


        }
    }
}
