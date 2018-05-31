package com.anji.multithreadhelloworld.repeatlock2;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 14:28
 */
public class Sub extends Main {
    synchronized public void operateISubMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
