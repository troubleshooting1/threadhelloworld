package com.anji.multithreadhelloworld.staticsynchronized;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 22:49
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printB();
    }
}
