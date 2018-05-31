package com.anji.multithreadhelloworld.synchronizedtest;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 14:01
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef1=new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2=new HasSelfPrivateNum();

        ThreadA athread=new ThreadA(numRef1);
        athread.start();

        ThreadB bthread=new ThreadB(numRef2);
        bthread.start();
    }
}
