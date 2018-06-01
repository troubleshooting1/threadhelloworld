package com.anji.multithreadhelloworld.jointest;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/31 16:11
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread threadTest=new MyThread();
        threadTest.start();

        //主线程需要等待子线程执行完成之后再结束。
        threadTest.join();
        System.out.println("我想当threadTest对象执行完毕后我再执行");
    }

    static public class MyThread extends Thread{
        @Override
        public void run(){
            System.out.println("我想先执行");
        }
    }
}
