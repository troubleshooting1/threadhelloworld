package com.anji.multithreadhelloworld.volatiletest2;

/**
 * Description: volatile原子性
 * author: chenqiang
 * date: 2018/5/31 13:48
 */
public class MyThread extends Thread {
    volatile public static int count;

    //运行的结果部分不为999，证明“volatile无法保证对变量原子性的”
    //原子操作是指不会被线程调度机制打断的操作
    //    private static void addCount() {
    //        for (int i = 0; i < 1000; i++) {
    //            count = i;
    //        }
    //        System.out.println("count=" + count);
    //    }


    //要保证数据的原子性还是要使用synchronized关键字
    synchronized private static void addCount() {
        for (int i = 0; i < 1000; i++) {
            count = i;
        }
        System.out.println("count=" + count);
    }

    @Override
    public void run() {
        addCount();
    }
}
