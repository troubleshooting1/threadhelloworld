package com.anji.multithreadhelloworld.staticsynchronized;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 22:51
 */
public class ThreadC extends Thread {
    private Service service;
    public ThreadC(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run(){
        service.printC();
    }
}
