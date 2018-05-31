package com.anji.multithreadhelloworld.staticsynchronized;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 22:47
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run(){
        service.printA();
    }
}
