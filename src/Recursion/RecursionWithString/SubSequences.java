package Recursion.RecursionWithString;
import java.util.ArrayList;
public class SubSequences {
    public static void main(String[] args) {
        System.out.println(getSSQ("Java"));
    }
    //str = "abc"
    static ArrayList<String> getSSQ(String str){
        ArrayList<String> ans = new ArrayList<>();
        //base case
        if (str.isEmpty()) {
            ans.add("");
            return ans;
        }
        char currChar = str.charAt(0); //currChar = "a"
        //calculate smallAns
        ArrayList<String> smallAns = getSSQ(str.substring(1));
        //add smallAns and CurrChar by for each loop
        for(String ss : smallAns){
            ans.add(ss);
            ans.add(currChar+ss);
        }
        return ans;
    }
}
