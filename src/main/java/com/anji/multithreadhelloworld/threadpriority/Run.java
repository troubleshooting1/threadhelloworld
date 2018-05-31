package com.anji.multithreadhelloworld.threadpriority;

import com.anji.multithreadhelloworld.thread6.MyThread;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 13:19
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("main thread begin priority=" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority=" + Thread.currentThread().getPriority());
        MyThread1 thread1 = new MyThread1();
        thread1.start();
    }
}
