package com.anji.multithreadhelloworld.threadlocaltest;

/**
 * Description:
 * author: chenqiang
 * date: 2018/6/1 13:21
 */
public class Test1 {
    public static ThreadLocal<String> t1=new ThreadLocal<String>();

    public static void main(String[] args) {
        if(t1.get()==null){
            System.out.println("为ThreadLocal类对象放入值:aaa");
            t1.set("aaa");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
