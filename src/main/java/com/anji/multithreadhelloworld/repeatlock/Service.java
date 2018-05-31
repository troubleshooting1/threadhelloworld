package com.anji.multithreadhelloworld.repeatlock;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 14:22
 */
public class Service {
    synchronized public void service1(){
        System.out.println("service1");
        service2();
    }

    synchronized public void service2(){
        System.out.println("service2");
        service3();
    }

    synchronized public void service3(){
        System.out.println("service3");
    }
}
