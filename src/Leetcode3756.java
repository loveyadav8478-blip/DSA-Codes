import java.util.Scanner;

public class Leetcode3756 {
    public int[] sumAndMultiply(String s, int[][] queries) {
        long MOD = 1_000_000_007L;
        int n = queries.length;
        int[] ans = new int[n];
        int[] prefix = new int[s.length()];
        String[] prefixDig = new String[n];
        prefixDig[0] = s.substring(0,0);
        prefix[0] = s.charAt(0) - '0';
        for (int i = 1; i < s.length(); i++) {
            prefix[i] = prefix[i - 1] + (s.charAt(i) - '0');
        }
        for(int i = 1; i <s.length(); i++){
            StringBuilder sb = new StringBuilder(prefixDig[i-1]);
            char ch = s.charAt(i);
            if(ch!='0'){
                sb.append(ch);
            }
            prefixDig[i] = sb.toString();
        }

        for (int i = 0; i < n; i++) {
            int idx1 = queries[i][0];
            int idx2 = queries[i][1];
            long x = 0;
//            for (int k = idx1; k <= idx2; k++) {
//                char ch = s.charAt(k);
//                if (ch != '0') {
//                    x = (x * 10 + (ch - '0')) % MOD;
//                }
//            }
            if(idx1==0){
                x = Long.parseLong(prefixDig[idx2]);
            }
            else{
                String str = prefixDig[idx2].replace(prefixDig[idx1-1]," ");
                x = Long.parseLong(str.trim());
            }

            long sum = 0;
            if (idx1 == 0) {
                sum = prefix[idx2];
            } else {
                sum = prefix[idx2] - prefix[idx1 - 1];
            }
            sum %= MOD;
            long product = (sum * x) % MOD;

            ans[i] = (int) product;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.
    }
}
