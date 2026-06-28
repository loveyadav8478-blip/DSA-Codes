package slidingWindow;

public class Weekly {
    public static void main(String[] args) {
        System.out.println(countValidSubarrays(new int[]{1,100,1},1));
    }
    public static int countValidSubarrays(int[] nums, int x) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j = i; j<n; j++){
                sum += nums[j];
                String s = String.valueOf(sum);
                if(s.charAt(0)-'0'==x && s.charAt(s.length()-1)-'0'==x){
                    count++;
                }
//                else{
//                    break;
//                }
            }
        }
        return count;
    }
}
