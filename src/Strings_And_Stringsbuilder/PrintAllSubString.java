package Strings_And_Stringsbuilder;
import java.util.*;
public class PrintAllSubString {
    public static void main(String[] args) {
        String str = "abcd";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= 4; j++) {
                System.out.print(str.substring(i,j) +" ");
            }
        }
    }
}
