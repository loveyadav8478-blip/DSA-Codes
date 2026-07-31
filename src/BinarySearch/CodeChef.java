package BinarySearch;

public class CodeChef {
    public static void main(String[] args) {
        int x = 5,y = 1, z = 2;
        int count = 1;
        x += y;
        if(x<=z){
            System.out.println(count);
        }
        while(x>z){
            x += y;
            z += z;
            count++;
        }
        System.out.println(Integer.MAX_VALUE);
        System.out.println(count);
    }
}
