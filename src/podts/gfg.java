package podts;

public class gfg {
    public static void main(String[] args) {
        System.out.println(find(new int[]{3, 4, 3, 2, 4}));
    }
    public static int find(int[] arr) {
        int max = -1;
        for(int e : arr){
            max = Math.max(max,e);
        }
        int x =0;
        int min = Integer.MAX_VALUE;
        while(x<=max){
            int temp = x;
            for(int e : arr){
                int diff = Math.abs(e-temp);
                if(temp>e){
                    temp += diff;
                }
                else{
                    temp -= diff;
                }
                if(temp<0) break;
            }
            if(temp>=0){
                min = Math.min(min,x);
            }
            x++;
        }
        return min;
    }
}
