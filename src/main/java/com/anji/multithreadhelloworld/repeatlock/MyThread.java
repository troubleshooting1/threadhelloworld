package com.anji.multithreadhelloworld.repeatlock;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 14:24
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        Service service=new Service();
        service.service1();
    }
}
