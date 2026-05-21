package com.multi_Threading;

class SharedObj{

    private volatile boolean flag = false;

    public void setFlagTrue(){
        System.out.println("Writer thread is make flag true");
        flag = true;
    }

    public void printIfFlagIsTrue(){
        while(!flag){

        }
        System.out.println("Flag is true!!");
    }
}

public class VolitileExample {

    public static void main(String[] args) {
        SharedObj sharedObj = new SharedObj();
        Thread writerThread = new Thread(()->{
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            sharedObj.setFlagTrue();
        });

        Thread readerThread = new Thread(()->{
            sharedObj.printIfFlagIsTrue();
        });
        readerThread.start();
        writerThread.start();
    }
}
