package com.anji.multithreadhelloworld.staticsynchronized;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 22:52
 */
public class Run {
    public static void main(String[] args) {
        Service service=new Service();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();

        ThreadC c=new ThreadC(service);
        c.setName("C");
        c.start();
    }
}
