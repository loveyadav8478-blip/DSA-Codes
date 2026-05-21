package Arraysandarraylists.Questions;
import java.util.ArrayList;
import java.util.Scanner;
public class InputAndOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of arrays : ");
        for (int i = 0; i <= n-1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Here the array : ");
        for (int i = 0; i <= n-1; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print(arr.length);
    }

    public static class multiDimenAL {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            //initilisation
            for (int i = 0; i < 3; i++) {
                list.add(new ArrayList<>());
            }
            //add element
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    list.get(i).add(sc.nextInt());
                }
                System.out.println();
            }
            System.out.println(list);
        }
    }
}
