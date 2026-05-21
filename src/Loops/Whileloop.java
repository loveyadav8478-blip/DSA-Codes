package Loops;

public class Whileloop {
    public static void main(String[] args) {
//        for (int i = 1; i <= 12; i++) {
//            System.out.println(i);
//        }
//        int i = 1;
//        while(i<=12){
//            System.out.println(i);
//            i++;
//        }
        int x = 4, y = 0;
        while(x >= 0){
            x--;
            y++;
            if(x==y)
                continue;
            else
                System.out.println(x+" "+y);
        }
    }
}
