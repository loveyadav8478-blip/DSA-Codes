package podts;
import java.util.*;
public class SequentialDigit {
    public static void main(String[] args) {
        System.out.println(sequentialDigits(1000,13000));
    }
    public static void helper(int fstDig, int lstDig, List<Integer> digs){
        if(lstDig==10){
            return;
        }
        digs.add(fstDig);
        lstDig++;
        helper(fstDig*10+lstDig,lstDig,digs);
    }
    public static List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        List<Integer> digs = new ArrayList<>();
        for(int i = 0; i< s.length(); i++){
            helper(s.charAt(i)-'0',s.charAt(i)-'0',digs);
        }
        List<Integer> ans = new ArrayList<>();
        int i =0;
        while(i<digs.size()){
            if(digs.get(i)<=high && digs.get(i)>=low){
                ans.add(digs.get(i));
            }
            i++;
        }
        Collections.sort(ans);
        return ans;
    }
}
