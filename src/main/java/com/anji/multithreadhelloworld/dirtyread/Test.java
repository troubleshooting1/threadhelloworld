package com.anji.multithreadhelloworld.dirtyread;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/30 14:15
 */
public class Test {
    public static void main(String[] args) {
        try {
            PublicVar publicVarRef=new PublicVar();
            ThreadA threadA=new ThreadA(publicVarRef);
            threadA.start();

            Thread.sleep(200);

            publicVarRef.getValue();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
