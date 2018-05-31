package com.anji.multithreadhelloworld.synchronizeddisadvantage;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 16:06
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();

        MyThread1 thread1 = new MyThread1(task);
        thread1.start();

        MyThread2 thread2 = new MyThread2(task);
        thread2.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long beginTime = CommonUtils.beginTime1;
        if (CommonUtils.beginTime2 > CommonUtils.beginTime1) {
            beginTime = CommonUtils.beginTime2;
        }

        long endTime = CommonUtils.endTime1;
        if (CommonUtils.endTime2 > CommonUtils.endTime1) {
            endTime = CommonUtils.endTime2;
        }

        //进程2必须要等进程1执行完毕，耗时约5秒/6秒
        System.out.println("耗时：" + ((endTime - beginTime) / 1000));
    }
}
