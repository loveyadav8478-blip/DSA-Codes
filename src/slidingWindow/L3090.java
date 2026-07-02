package slidingWindow;
import java.util.*;
public class L3090 {
    public static void main(String[] args) {
        System.out.println(maxSubarrayLength(new int[]{1,2,3,1,2,3,1,2},2));
//        System.out.println(maximumLengthSubstring("eebadadbfa"));
    }
    public static int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        Map<Integer,Integer> m = new HashMap<>();
        int dups = 0;
        int ans = 0;
        while(j<n){
            if(m.containsKey(nums[j])){
                m.put(nums[j],m.get(nums[j])+1);
                if(m.get(nums[j])>k){
                    dups++;
                }
            }
            else m.put(nums[j],1);

            while(dups>=1){
                if(m.get(nums[i])>k){
                    dups--;
                }
                m.put(nums[i],m.get(nums[i])-1);
                if(m.get(nums[i])==0){
                    m.remove(nums[i]);
                }
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
    public static int maximumLengthSubstring(String s) {
        int n = s.length();
        Map<Character,Integer> m = new HashMap<>();
        int dups = 0;
        int i = 0;
        int j = 0;
        int ans = 0;
        while(j<n){
            if(m.containsKey(s.charAt(j))){
                m.put(s.charAt(j),m.get(s.charAt(j))+1);
                if(m.get(s.charAt(j))>2){
                    dups++;
                }
            }
            else{
                m.put(s.charAt(j),1);
            }
            while(dups>=1){
                if(m.get(s.charAt(i))>2){
                    dups--;
                }
                m.put(s.charAt(i),m.get(s.charAt(i))-1);
                if(m.get(s.charAt(i))==0) m.remove(s.charAt(i));
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
    public static int maximumLengthSubstringN2(String s) {
        int ans = 0;
        int i = 0;
        int j = 0;
        for(i = 0; i< s.length(); i++){
            Map<Character,Integer> m = new HashMap<>();
            for(j = i; j< s.length(); j++){
                boolean bool = true;
                m.put(s.charAt(j),m.getOrDefault(s.charAt(j),0)+1);
                for(var v : m.values()){
                    if(v>2){
                        bool = false;
                        break;
                    }
                    else if(v<=2){
                        ans = Math.max(ans,j-i+1);
                    }
                }
                if(!bool) break;
            }
        }
        return ans;
    }
}
