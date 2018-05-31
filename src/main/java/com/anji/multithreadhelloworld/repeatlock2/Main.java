package com.anji.multithreadhelloworld.repeatlock2;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 14:26
 */
public class Main {
    public int i = 10;

    synchronized public void operateIMainMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
