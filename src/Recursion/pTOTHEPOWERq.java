package Recursion;

public class pTOTHEPOWERq {
    public static void main(String[] args) {
        System.out.println(pow1(5,4));
    }
    static int pow(int p, int q){
        if (q == 0) {
            return 1;
        }
        return pow(p,q-1)*p;
    }
    static int pow1(int p, int q){
        if (q == 0) {
            return 1;
        }
        int smallAns = pow(p,q/2);
        if (q % 2 == 0) {

            return smallAns*smallAns;
        }
        return p*smallAns*smallAns;
    }
}
