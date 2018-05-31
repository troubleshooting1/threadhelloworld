package com.anji.multithreadhelloworld.threadpriority;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 13:18
 */
public class MyThread2 extends Thread {
    @Override
    public void run(){
        System.out.println("MyThread2 run provrity="+this.getPriority());
    }
}
