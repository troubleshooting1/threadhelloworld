package com.anji.multithreadhelloworld.LockTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Description:
 * author: chenqiang
 * date: 2018/6/1 13:58
 */
public class ReentrantLockTest {
    public static void main(String[] args) {
        MyService service = new MyService();

        //当一个线程运行完毕后才把锁释放，其他线程才能执行，其他线程的执行顺序是不确定的
        MyThread a1 = new MyThread(service, "a1");
        MyThread a2 = new MyThread(service, "a2");
        MyThread a3 = new MyThread(service, "a3");
        MyThread a4 = new MyThread(service, "a4");
        MyThread a5 = new MyThread(service, "a5");

        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
    }

    static public class MyService {
        private Lock lock = new ReentrantLock();

        public void testMethod(String name) {
            lock.lock();
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println(name + " ThreadName=" + Thread.currentThread().getName() + (" " + (i + 1)));
                }
            } finally {
                lock.unlock();
            }
        }
    }

    static public class MyThread extends Thread {
        private MyService service;
        private String name;

        public MyThread(MyService service, String name) {
            super();
            this.service = service;
            this.name = name;
        }

        @Override
        public void run() {
            service.testMethod(name);
        }
    }
}
