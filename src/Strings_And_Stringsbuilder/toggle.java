package Strings_And_Stringsbuilder;
import java.util.*;
public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;//Matlab CAPITAL
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            int asci = (int)ch;
            if (asci >= 97) flag = false;//Matlab small
            if ((asci >= 65 && asci <= 90) || (asci >= 97 && asci <= 122)) {
                if (flag == true) {
                    asci += 32;
                    char ans = (char)asci;
                    str.setCharAt(i,ans);
                }else{
                    asci -= 32;
                    char ans = (char)asci;
                    str.setCharAt(i,ans);
                }
            }else{
                System.out.println("Invalid Input!!");
            }
        }
        System.out.println(str);
    }
}
