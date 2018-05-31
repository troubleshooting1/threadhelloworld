package com.anji.multithreadhelloworld.dirtyread;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 14:14
 */
public class ThreadA extends Thread {
    private PublicVar publicVar;

    public ThreadA(PublicVar publicVar){
        super();
        this.publicVar=publicVar;
    }

    @Override
    public void run(){
        super.run();
        publicVar.setValue("B","BB");
    }
}
