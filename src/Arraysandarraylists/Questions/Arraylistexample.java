package Arraysandarraylists.Questions;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylistexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(55);
        list.add(43);
        list.add(23);
        list.add(444);
        list.add(22222223);
        list.add(34);
        list.add(87);
        list.set(2,444);
//        System.out.println(list.contains(34));
//        list.remove(4);
//
        System.out.print(list);


    }
}
