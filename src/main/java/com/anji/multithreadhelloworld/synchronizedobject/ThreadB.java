package com.anji.multithreadhelloworld.synchronizedobject;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 16:43
 */
public class ThreadB extends Thread {
    private Service service;
    private MyObject object;

    public ThreadB(Service service, MyObject object) {
        super();
        this.service = service;
        this.object = object;
    }

    @Override
    public void run(){
        super.run();
        service.testMethod1(object);
    }
}
