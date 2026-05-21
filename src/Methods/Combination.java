package Methods;
import java.util.Scanner;
public class Combination {
    public static int fact(int x){
        int xFact = 1;
        for (int i = 1; i <= x; i++) {
            xFact *= i;
        }
        return xFact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
//        int nCr = fact(n)/(fact(r)*fact(n-r));
        int nPr = fact(n)/fact(n-r);
//        System.out.print(nCr);
        System.out.print(nPr);
    }
}
