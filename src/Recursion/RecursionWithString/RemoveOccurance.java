package Recursion.RecursionWithString;

public class RemoveOccurance {
    public static void main(String[] args) {
        String str = "abcxyz";
        System.out.println(removeA(str,0,'a'));
        System.out.println(removeA2(str));
    }
    static String remove(String str,char ch) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                ans += str.charAt(i);
            }
        }
        return ans;
    }
    static String removeA(String str, int i, char target){
        //base case
        if (i == str.length()) return "";
        //smallAns
        String smallAns = removeA(str,i+1,target);
        char currentAns = str.charAt(i);
        if (currentAns != target) return currentAns + smallAns;
        else return smallAns;
    }
    static String removeA2(String str){
        if (str.length() == 0) return "";
        String smallAns = removeA2(str.substring(1));
        char currentAns = str.charAt(0);
        if (currentAns != 'a') return currentAns + smallAns;
        else return smallAns;
    }
}
