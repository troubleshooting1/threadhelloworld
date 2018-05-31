package com.anji.multithreadhelloworld.thread5;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 13:02
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread=new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
