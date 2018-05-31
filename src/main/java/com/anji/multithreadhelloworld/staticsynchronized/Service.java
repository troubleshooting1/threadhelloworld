package com.anji.multithreadhelloworld.staticsynchronized;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 17:25
 */
public class Service {
    public static void printA(){
        synchronized (Service.class){
            try {
                System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printA");
                Thread.sleep(3000);
                System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printA");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    synchronized public static void printB(){
        System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printB");
        System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printB");
    }

    //synchronized关键字加到非static静态方法上持有的是对象锁,即只能同步执行
    synchronized public void printC(){
        System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入printC");
        System.out.println("线程名称为："+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开printC");
    }
}
