package Arraysandarraylists.Sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args) {
        float[] arr = {0.5f, 0.4f, 0.3f, 0.2f, 0.1f};
        bucketSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bucketSort(float[] arr){
        int   n = arr.length;
        //Making Bucket
        ArrayList<Float>[] buckets = new ArrayList[n];
        //create empty bucket
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();

        }
        // Add elements in buckets
        for (int i = 0; i < n; i++) {
            int bucketIdx = (int) arr[i]*n;
            buckets[bucketIdx].add(arr[i]);
        }
        //Sort the buckets elements
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }
        //merge
        int idx = 0;
        for (int i = 0; i < buckets.length; i++) {
            ArrayList<Float> currBucket = buckets[i];
            for (int j = 0; j < currBucket.size(); j++) {
                arr[idx++] = currBucket.get(j);
            }
        }
    }
}
