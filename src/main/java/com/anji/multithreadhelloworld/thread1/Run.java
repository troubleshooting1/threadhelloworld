package com.anji.multithreadhelloworld.thread1;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 0:03
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        System.out.println("运行结束");
    }
}
