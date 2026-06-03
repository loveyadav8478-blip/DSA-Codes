package Strings_And_Stringsbuilder;

public class Leetcode796 {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        if(n!=goal.length()) return false;
        StringBuilder sb = new StringBuilder(s);
        int j = 0;
        while(j<n) {
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(0);
                sb.deleteCharAt(0);
                sb.append(ch);
                if(sb.equals(goal)){
                    return true;
                }
            }
        }
        return false;
    }
}
