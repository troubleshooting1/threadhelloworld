package com.anji.multithreadhelloworld.thread1;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 0:02
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        super.run();
        System.out.println("MyThread");
    }
}
