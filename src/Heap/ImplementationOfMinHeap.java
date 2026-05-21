package Heap;
import java.util.Arrays;
class Heap{
    Heap(int capacity){
        arr = new int[capacity+1];
        Arrays.fill(arr,Integer.MAX_VALUE);
    }
    int[] arr;
    int idx = 1;
    int peek(){
        if(idx==1){
            System.out.println("Heap is Empty!");
            return -1;
        }
        return arr[1];
    }
    int size(){
        return idx-1;
    }
    void display(){
        for(int i = 1; i < idx; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    int remove(){
        if(idx==1){
            System.out.println("Heap is Empty!");
            return -1;
        }
        int min = arr[1];
        arr[1] = arr[idx-1];
        int root = 1;
        while(root<=size()){
            int left = 2*root, right = 2*root+1;
            int lVal = (left<=size()) ? arr[left] : Integer.MAX_VALUE;
            int rVal = (right<=size()) ? arr[right] : Integer.MAX_VALUE;
            if(arr[root]<lVal && arr[root]<rVal) break;
            else{
                if(lVal<rVal){
                    int temp = arr[root];
                    arr[root] = arr[left];
                    arr[left] = temp;
                    root = left;
                }
                else{
                    int temp = arr[root];
                    arr[root] = arr[right];
                    arr[right] = temp;
                    root = right;
                }
            }

        }
        idx--;
        return min;
    }
    void add(int e){
        if(idx == arr.length){
            System.out.println("Heap is Full!");
            return;
        }
        int root = idx;
        arr[idx++] = e;
        while(root!=1){
            int parent = root/2;
            if(arr[parent]>arr[root]){
                int temp = arr[root];
                arr[root] = arr[parent];
                arr[parent] = temp;
                root = parent;
            }
            else break;
        }
    }
}
public class ImplementationOfMinHeap {
    public static void main(String[] args) {
        Heap pq = new Heap(10);
        pq.add(10);
        pq.add(15);
        pq.add(8);
        pq.add(9);
        pq.add(4);
        System.out.println(pq.remove());
        pq.add(2);
        System.out.println(pq.remove());
        pq.display();
    }
}
