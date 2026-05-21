package Recursion.RecursionWithString;
import Strings_And_Stringsbuilder.PrettyPrinting;
public class PrintAllSubsequences {
    public static void main(String[] args) {
        PPSQ("Java","");
    }
    static void PPSQ(String str, String currAns){
        if (str.isEmpty()) {
            System.out.println(currAns);
            return;
        }
        char currChar = str.charAt(0);
        String remString = str.substring(1);
        //Included case
        PPSQ(remString,currAns+currChar);
        //Excluded case
        PPSQ(remString,currAns);

    }
}
