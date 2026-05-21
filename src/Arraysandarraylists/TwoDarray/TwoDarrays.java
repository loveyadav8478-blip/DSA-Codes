package Arraysandarraylists.TwoDarray;
import java.util.Scanner;
public class TwoDarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the rows and cols : ");
//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
//        int[][] arr = new int[rows][cols];
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        int[][] arr = {
                {1, 2, 3, 4},
                {2, 5, 8},
                {2, 79, 6, 36,4}
        };
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                System.out.print(arr[rows][cols]+" ");
            }
            System.out.println();
        }
    }

//    public static class SetMatrixZero {
//        public static void main(String[] args) {
//            int[][]  = {[1, 1, 1],{1, 0, 1}
//                        ,
//
//            }
//        }
//    }
}
