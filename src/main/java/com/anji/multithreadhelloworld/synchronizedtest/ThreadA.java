package com.anji.multithreadhelloworld.synchronizedtest;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 13:58
 */
public class ThreadA extends Thread {
    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run(){
        super.run();
        numRef.addI("a");
    }
}
