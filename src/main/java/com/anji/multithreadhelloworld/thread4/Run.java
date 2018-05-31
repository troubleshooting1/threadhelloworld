package com.anji.multithreadhelloworld.thread4;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 0:13
 */
public class Run {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        //通过myThread对象创建
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");
        Thread f = new Thread(myThread, "F");
        Thread g = new Thread(myThread, "G");
        Thread h = new Thread(myThread, "H");
        Thread i = new Thread(myThread, "I");
        Thread j = new Thread(myThread, "J");
        Thread k = new Thread(myThread, "K");
        Thread l = new Thread(myThread, "L");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        f.start();
        g.start();
        h.start();
        i.start();
        j.start();
        k.start();
        l.start();

    }
}
