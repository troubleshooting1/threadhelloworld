package com.anji.multithreadhelloworld.synchronizedobject;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 16:47
 */
public class Run1_2 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object1 = new MyObject();
        MyObject object2 = new MyObject();

        //传递不同的对象，线程无法锁定
        ThreadA a = new ThreadA(service, object1);
        a.setName("a");
        a.start();

        ThreadB b = new ThreadB(service, object1);
        b.setName("b");
        b.start();
    }
}
