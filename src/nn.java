import java.util.*;
public class nn {
    public static void main(String[] args) {
        System.out.println(numberOfSubarrays(new int[]{1,1,2,1,1},3));
//        System.out.println(subarraysWithKDistinct(new int[]{1,2,1,2,3},2));
    }
    public static int subarraysWithKDistinct(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        Set<Integer> st = new HashSet<>();
        int dups = 0;
        int i = 0;
        int j = 0;
        while(j< n){
            if(st.contains(nums[j])){
                dups++;
            }
            st.add(nums[j]);
            while(st.size()==k){
                count++;
                if(dups!=0 && st.contains(nums[i])){
                    dups--;
                }


            }
            if(st.size()!=k){
                st.remove(nums[i]);
                i++;
            }
            j++;
        }
        return count;
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        int i = 0;
        int j = 0;
        int countOdd = 0;
        while(j<n){
            if(nums[j]%2!=0){
                countOdd++;
            }
            while(countOdd==k){
                if(nums[i]%2!=0){
                    countOdd--;
                }
                ans += n-j;
                i++;
            }
            j++;
        }
        return ans;
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int n = s.length();
        int lenP = p.length();
        Set<Character> st = new HashSet<>();
        for(char c : p.toCharArray()){
            st.add(c);
        }
        int tempSize = st.size();
        for(int i = 0;i <n; i++){
            char ch = s.charAt(i);
            if(p.indexOf(ch)!=-1){
                String str = s.substring(i,Math.min(i+lenP,n));
                Set<Character> st1 = new HashSet<>();
                for(int j = 0; j< Math.min(n,Math.min(str.length(),p.length())); j++){
                    st1.add(str.charAt(j));
//                    st1.add(p.charAt(j));
                }
                if(tempSize==st1.size() && str.length()==p.length()){
                    ans.add(i);
                }
                Scanner sc = new Scanner(System.in);
                String m = sc.nextLine();
            }
        }
        return ans;
    }

}
