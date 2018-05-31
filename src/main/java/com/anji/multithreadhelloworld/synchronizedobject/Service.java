package com.anji.multithreadhelloworld.synchronizedobject;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 16:38
 */
public class Service {
    public void testMethod1(MyObject object){
        synchronized (object){
            try {
                System.out.println("testMethod1 _getlock time="+System.currentTimeMillis()+" run ThreadName="
                    +Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod1 releaselock time="+System.currentTimeMillis()+" run ThreadName="
                        +Thread.currentThread().getName());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
