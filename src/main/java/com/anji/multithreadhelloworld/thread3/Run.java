package com.anji.multithreadhelloworld.thread3;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 0:10
 */
public class Run {
    public static void main(String[] args) {
        //线程数据不共享
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();
    }
}
