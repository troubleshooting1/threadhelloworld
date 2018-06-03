package com.anji.multithreadhelloworld.conditiontest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Description:
 * author: chenqiang
 * date: 2018/6/1 14:53
 */
public class UseSingleConditionWaitNotify {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();

        Thread.sleep(3000);
        service.signal();
    }

    static public class MyService {
        private Lock lock = new ReentrantLock();
        public Condition condition = lock.newCondition();

        public void await() {
            lock.lock();
            try {
                System.out.println(System.currentTimeMillis() + "await时间为");
                condition.await();
                System.out.println(System.currentTimeMillis() + "这是condition.await()方法之后的语句，condition.signal()方法之后我才被执行");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        public void signal() throws InterruptedException {
            lock.lock();
            try {
                System.out.println(System.currentTimeMillis() + "signal时间为");
                condition.signal();
                Thread.sleep(3000);
                System.out.println(System.currentTimeMillis() + "这是condition.signal()方法之后的语句");     //执行完毕后再执行await中的System.out.println(System.currentTimeMillis() + "这是condition.await()方法之后的语句，condition.signal()方法之后我才被执行");
            } finally {
                lock.unlock();
            }
        }

    }

    static public class ThreadA extends Thread {
        private MyService service;

        public ThreadA(MyService service) {
            super();
            this.service = service;
        }

        @Override
        public void run() {
            service.await();
        }
    }
}
