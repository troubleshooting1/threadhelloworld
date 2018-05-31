package com.anji.multithreadhelloworld.thread4;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 0:12
 */
public class MyThread extends Thread {
    private int count = 5;

    @Override
    public void run() {
            //        synchronized(this) {
            super.run();
            count--;
            System.out.println("由 " + MyThread.currentThread().getName() + " 计算，count=" + count);
    }
}
