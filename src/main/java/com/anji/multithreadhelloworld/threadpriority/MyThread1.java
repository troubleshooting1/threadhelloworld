package com.anji.multithreadhelloworld.threadpriority;

import com.anji.multithreadhelloworld.thread6.MyThread;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 13:17
 */
public class MyThread1 extends Thread {
    @Override
    public void run(){
        System.out.println("Mythread1 run priority="+this.getPriority());
        MyThread2 thread2=new MyThread2();
        thread2.start();
    }
}
