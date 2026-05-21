package com.multi_Threading;

import java.util.concurrent.Executor;
import java.util.concurrent.*;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int noOfService = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(noOfService);
        CountDownLatch countDownLatch = new CountDownLatch(noOfService);
        executorService.submit(new DependentService(countDownLatch));
        executorService.submit(new DependentService(countDownLatch));
        executorService.submit(new DependentService(countDownLatch));
        countDownLatch.await();

        System.out.println("Main");
        executorService.shutdown();

    }

}
class DependentService implements Callable<String>{

    private final CountDownLatch latch;

    DependentService(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {
        try{
            System.out.println(Thread.currentThread().getName()+ " Service started");
            Thread.sleep(2000);
        }finally{
            latch.countDown();
        }
        return "ok";
    }
}
