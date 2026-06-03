package Strings_And_Stringsbuilder;

public class Main {
    public static void main(String[] args) {
        int[] nums = {999,19,199};
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        String s = "";
        for(int i = 0; i < n; i++){
            s += String.valueOf(nums[i]);
            s += ",";
        }
        System.out.println(s);
        int t = 0;
        for(int i = 0; i< s.length(); i++){

            if(s.charAt(i)!=','){
                t += s.charAt(i)-'0';
            }
            else{
                min = Math.min(min,t);
                t = 0;
                continue;
            }
        }

        System.out.println(min);
//        return min;
    }
}
