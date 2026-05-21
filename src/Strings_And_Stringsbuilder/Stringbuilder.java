package Strings_And_Stringsbuilder;
import java.util.*;
public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
//        System.out.println(str);
//        str.setCharAt(0,'d');
//        System.out.println(str);
//        str.append(" Jhelo");
        str.insert(0,'s');
        str.deleteCharAt(0);
        System.out.println(str);

    }
}