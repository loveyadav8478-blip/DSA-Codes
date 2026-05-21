package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
    PriorityQueue<Integer> min = new PriorityQueue<>();
    PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {}

    public void addNum(int num) {
        if(max.isEmpty()) max.add(num);
        else{
            if(num<max.peek())max.add(num);
            else min.add(num);
        }
        if(max.size()==min.size()+2) min.add(max.remove());
        if(min.size()==max.size()+2) max.add(min.remove());
    }

    public double findMedian() {
        if(min.size()==max.size()+1) return min.peek();
        else if(max.size()==min.size()+1) return max.peek();
        else return (max.peek()+min.peek())/2.0;
    }
}
