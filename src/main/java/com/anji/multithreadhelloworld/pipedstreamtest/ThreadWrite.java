package com.anji.multithreadhelloworld.pipedstreamtest;

import java.io.PipedOutputStream;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/31 15:32
 */
public class ThreadWrite extends Thread {
    private WriteData write;
    private PipedOutputStream out;

    public ThreadWrite(WriteData write,PipedOutputStream out){
        super();
        this.write=write;
        this.out=out;
    }

    @Override
    public void run(){
        write.writeMethod(out);
    }
}
