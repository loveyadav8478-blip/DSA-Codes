package com.multi_Threading;

public class Test {
    public static void main(String[] args) {
        World wrl = new World();
        wrl.start();

        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
