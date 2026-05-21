package com.multi_Threading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    private AtomicInteger count = new AtomicInteger(0);
    public void increment(){
        count.getAndIncrement();
    }
    public int getCount(){
        return count.get();
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicCounter ac = new AtomicCounter();
        Thread t1 = new Thread(()->{
            for(int i = 0; i< 1000; i++){
                ac.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i = 0; i< 1000; i++){
                ac.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("count is "+ ac.getCount());
    }
}
