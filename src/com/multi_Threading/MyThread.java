package com.multi_Threading;

public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i = 1; i<= 10; i++){
            System.out.println(Thread.currentThread().getName()+" is Running..");
//            Thread.yield();
        }
//        try {
//            Thread.sleep(100);
//            System.out.println("Thread is running....z.z.z.");
//        } catch (InterruptedException e) {
//            System.out.println("Thread is interrupted"+ e);
//        }


//        for(int i=1; i<=5; i++){
//            String a = "";
//            for(int j = 0; j< 10000; j++){
//                a += "a";
//            }
//            System.out.println(Thread.currentThread().getName() + " - Priority "+Thread.currentThread().getPriority()+" count"+i);
//
//        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new MyThread("t1");
        Thread t2 = new MyThread("t2");
        t1.run();
        t2.run();
//        t1.start();
//        t2.start();
    }
}
