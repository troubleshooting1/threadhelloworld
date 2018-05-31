package com.anji.multithreadhelloworld.daemon;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 13:39
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread=new MyThread();
            thread.setDaemon(true);     //设置守护进程
            thread.start();
            Thread.sleep(5000);
            System.out.println("我离开thread对象也不再打印了，也就是停止了！");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
