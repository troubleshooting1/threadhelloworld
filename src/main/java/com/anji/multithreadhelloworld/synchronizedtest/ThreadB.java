package com.anji.multithreadhelloworld.synchronizedtest;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 13:59
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef){
        super();
        this.numRef=numRef;
    }

    @Override
    public void run(){
        super.run();
        numRef.addI("b");
    }
}
