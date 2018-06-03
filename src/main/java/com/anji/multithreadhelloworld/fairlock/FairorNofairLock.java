package com.anji.multithreadhelloworld.fairlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Description:
 * author: chenqiang
 * date: 2018/6/3 12:20
 */
public class FairorNofairLock {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service(false);        //true为公平锁，false为非公平锁

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("※线程" + Thread.currentThread().getName() + "运行了");
                service.serviceMethod();
            }
        };

        Thread[] threaArray = new Thread[30];
        for (int i = 0; i < 30; i++) {
            threaArray[i] = new Thread(runnable);
        }

        for (int i = 0; i < 30; i++) {
            threaArray[i].start();
        }
    }

    static public class Service {
        private ReentrantLock lock;

        public Service(boolean isFair) {
            super();
            lock = new ReentrantLock(isFair);
        }

        public void serviceMethod() {
            lock.lock();
            try {
                System.out.println("ThreadName=" + Thread.currentThread().getName() + "获得锁定");
            } finally {
                lock.unlock();
            }
        }
    }
}
