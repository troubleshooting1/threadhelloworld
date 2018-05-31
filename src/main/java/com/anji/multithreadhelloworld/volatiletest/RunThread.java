package com.anji.multithreadhelloworld.volatiletest;

/**
 * Description: volatile 测试
 * author: chenqiang
 * date: 2018/5/31 13:39
 */
public class RunThread extends Thread {
    volatile private boolean isRunning = true;
    int m;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    @Override
    public void run() {
        System.out.println("进入run了");
        while (isRunning == true) {
            int a = 2;
            int b = 3;
            int c = a + b;
            m = c;
            //加了输出或者sleep语句之后，CPU就有可能有时间去保证内存的可见性，于是while循环可以被终止!!!!!!!
            //            System.out.println(m);
        }
        System.out.println(m);
        System.out.println("线程被停止了");
    }
}
