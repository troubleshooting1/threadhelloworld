package com.anji.multithreadhelloworld.repeatlock2;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 14:31
 */
public class Run {
    //    当存在父子类继承关系时，子类是完全可以通过“可重入锁”调用父类的同步方法
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
    }
}
