package com.anji.multithreadhelloworld.thread6;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 13:01
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        while (true){
            if(this.isInterrupted()){
                System.out.println("停止了");
                return;
            }
            System.out.println("timer="+System.currentTimeMillis());
        }
//        super.run();
//        for (int i = 0; i < 5000000; i++) {
//            if(this.isInterrupted()) {
//                System.out.println("已经是停止状态了，我要退出！");
//                break;
//            }
//            System.out.println("i=" + (i + 1));
//        }
//        System.out.println("看到这句证明线程并未终止---------------");
    }


}
