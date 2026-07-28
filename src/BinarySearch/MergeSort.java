package BinarySearch;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];
        for(int i = 0; i< n; i++){
            nums1[i] = sc.nextInt();
        }
        for(int i = 0; i< n; i++){
            nums2[i] = sc.nextInt();
        }

        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<n && j<n){
            if(nums1[i]<nums2[j]){
                ans.add(nums1[i]);
                i++;
            }
            else if(nums1[i]>nums2[j]){
                ans.add(nums2[j]);
                j++;
            }
            else{
                ans.add(nums1[i]);
                ans.add(nums2[j]);
                i++;
                j++;
            }
        }
        while(i<n){
            ans.add(nums1[i]);
            i++;
        }
        while(j<n){
            ans.add(nums2[j]);
            j++;
        }
        System.out.println(ans);
    }
}
