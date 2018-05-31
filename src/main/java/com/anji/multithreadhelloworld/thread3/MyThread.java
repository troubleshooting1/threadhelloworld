package com.anji.multithreadhelloworld.thread3;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 0:08
 */
public class MyThread extends Thread {
    private int count = 5;

    public MyThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由 " + MyThread.currentThread().getName() + " 计算,count=" + count);
        }
    }
}
