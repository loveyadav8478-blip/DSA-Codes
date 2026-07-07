public class Leetcode3754 {
    public static void main(String[] args) {
        System.out.println(sumAndMultiply(0));
    }
    public static long sumAndMultiply(int n) {
        int t = n;
        StringBuilder x = new StringBuilder();
        long sum = 0;
        while(t>0){
            int lastDig = t%10;
            if(lastDig!=0){
                x.append(String.valueOf(lastDig));
                sum += lastDig;
            }
            t /= 10;
        }
        x.reverse();
        return (x.isEmpty()) ? 0 :(long)Long.parseLong(x.toString())*sum;
    }
}
