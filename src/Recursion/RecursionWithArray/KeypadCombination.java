package Recursion.RecursionWithArray;

public class KeypadCombination {
    public static void main(String[] args) {
        String dig = "253";
        String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        printAllCombination(dig,kp,"");
    }
    static void printAllCombination(String dig, String[] kp, String res){
        if (dig.isEmpty()) {
            System.out.print(res+" ");
            return;
        }
        int currNum = dig.charAt(0) - '0';
        String currChoice = kp[currNum];
        for (int i = 0; i < currChoice.length(); i++) {
                printAllCombination(dig.substring(1),kp,res+currChoice.charAt(i));
        }
    }
}
