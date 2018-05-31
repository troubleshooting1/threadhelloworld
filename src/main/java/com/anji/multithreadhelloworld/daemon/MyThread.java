package com.anji.multithreadhelloworld.daemon;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 13:38
 */
public class MyThread extends Thread {
    private int i=0;

    @Override
    public void run(){
        try{
            while (true){
                i++;
                System.out.println("i="+i);
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
