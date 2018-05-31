package com.anji.multithreadhelloworld.notifytest;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/31 14:26
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(50);

            ThreadB b = new ThreadB(lock);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
