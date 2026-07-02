package Greedy;
import java.util.*;
public class ShopInCandyStore {
    public static void main(String[] args) {
//        System.out.println(minMaxCandy(new int[]{3,16,9,1},3));
//        System.out.println(minMaxCandy(new int[]{9 ,13 ,4 ,17 ,7 ,13},1));
        String s = "   m,,,,  ";
        if(s.contains(".")){
            System.out.println("Yes");
        }
        System.out.println(s.isBlank());
    }
    public static ArrayList<Integer> minMaxCandy(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = nums.length-1;
        int cost = 0;
        while(i<=j){
            cost += nums[i];
            j-=k-1;
            i++;
        }
        min = Math.min(min,cost);
        int max = Integer.MIN_VALUE;
        j = 0;
        i = nums.length-1;
        cost = 0;
        while(i>=j){
            cost += nums[i];
            j += k-1;
            i--;
        }
        max = Math.max(max,cost);
        ans.add(min);
        ans.add(max);
        return ans;
    }
}
