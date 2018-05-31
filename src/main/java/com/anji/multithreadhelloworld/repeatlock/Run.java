package com.anji.multithreadhelloworld.repeatlock;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 14:24
 */
public class Run {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
    }
}
