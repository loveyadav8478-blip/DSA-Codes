package BitManuplation;

public class BitWiseOrAndXor {
    public static void main(String[] args) {
        System.out.println(3^1);
        int x = 5;
        System.out.println(~x);//1's complement
        System.out.println(-x-1);//1's complement
        System.out.println(~x+1);//2's complement
        System.out.println(-x);//2's complement
        System.out.println(0^2^2);
    }
}
