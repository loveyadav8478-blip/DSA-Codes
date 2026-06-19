package slidingWindow;

public class LongestRepeatingCharReplacement {
    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB",2));
    }
    public static int characterReplacement(String s, int k) {
        int n = s.length();
        int i = 0;
        int j = 0;
        int max = 0;
        for(i = 0; i< n; i++){
            char target = s.charAt(i);
            int limit = k;
            for(j = i; j< n; j++){
                char ch = s.charAt(j);
                if(ch==target){
                    continue;
                }
                else if(limit==0){
                    break;
                }

                if(ch!=target){
                    limit--;
                }
            }
            max = Math.max(max,j-i);
        }
        return max;
    }
}
