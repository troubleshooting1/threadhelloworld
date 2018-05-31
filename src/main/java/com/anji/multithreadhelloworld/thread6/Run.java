package com.anji.multithreadhelloworld.thread6;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 13:02
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        MyThread t=new MyThread();
        t.start();
        Thread.sleep(2000);
        t.interrupt();
    }
}
