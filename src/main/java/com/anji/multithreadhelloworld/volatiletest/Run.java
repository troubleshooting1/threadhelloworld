package com.anji.multithreadhelloworld.volatiletest;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/31 13:41
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        RunThread thread=new RunThread();

        thread.start();
        Thread.sleep(1000);
        thread.setRunning(false);

        System.out.println("已经赋值为false");
    }
}
