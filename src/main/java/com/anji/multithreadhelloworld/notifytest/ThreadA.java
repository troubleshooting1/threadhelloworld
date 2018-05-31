package com.anji.multithreadhelloworld.notifytest;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/31 14:21
 */
public class ThreadA extends Thread {
    private Object lock1;

    public ThreadA(Object lock1) {
        super();
        this.lock1 = lock1;
    }

    @Override
    public void run() {
        try {
            synchronized (lock1) {
                if (MyList.size() != 5) {
                    System.out.println("wait begin " + System.currentTimeMillis());
                    lock1.wait();
                    //线程Bnotify()执行后并不会立即释放锁，等线程B执行完毕之后才会执行这条语句
                    System.out.println("wait end " + System.currentTimeMillis());
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
