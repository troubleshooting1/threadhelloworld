package com.anji.multithreadhelloworld.repeatlock2;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 14:30
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        Sub sub=new Sub();
        sub.operateISubMethod();
    }
}
