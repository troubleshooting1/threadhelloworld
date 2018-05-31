package com.anji.multithreadhelloworld.synchronizeddisadvantage;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 16:05
 */
public class MyThread2 extends Thread {
    private Task task;

    public MyThread2(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}
