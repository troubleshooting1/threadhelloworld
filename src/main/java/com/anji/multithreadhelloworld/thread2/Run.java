package com.anji.multithreadhelloworld.thread2;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 0:05
 */
public class Run {
    public static void main(String[] args) {
        Runnable runnable=new MyRunnable();
        Thread thread=new Thread(runnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
