package Arraysandarraylists.Sorting;
import java.util.Arrays;
public class LexicographicalOrder {
    public static void main(String[] args) {
        String[] fruits = {"papaya","lime","watermelon","apple","mango","kiwi"};
        sortFruits(fruits);
        System.out.println(Arrays.toString(fruits));
    }
    static void sortFruits(String[] fruits){
        int n = fruits.length;
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if (fruits[j].compareTo(fruits[min_index]) < 0){
                    min_index = j;
                }
            }
            swap(fruits,i,min_index);
        }
    }
    static void swap(String[] fruits, int i1, int i2){
        String temp = fruits[i1];
        fruits[i1] = fruits[i2];
        fruits[i2] = temp;
    }
}
