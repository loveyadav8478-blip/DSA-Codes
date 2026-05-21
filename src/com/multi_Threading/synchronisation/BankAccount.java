package com.multi_Threading.synchronisation;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw "+ amount);
        try{
            if(lock.tryLock(1000, TimeUnit.MICROSECONDS)){
                if(balance>=amount){
                    try {
                        System.out.println(Thread.currentThread().getName()+" proceeding the withdraw");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName()+" Transection Successful and required balance is "+balance);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock();
                    }

                }else{
                    System.out.println(Thread.currentThread().getName()+" insufficient balance");
                }
            }else{
                System.out.println(Thread.currentThread().getName()+" Could not acquire the lock please try again later");
            }
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }
    }

}
