package com.anji.multithreadhelloworld.pipedstreamtest;

import java.io.PipedInputStream;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/31 15:30
 */
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedInputStream input;

    public ThreadRead(ReadData read, PipedInputStream input) {
        super();
        this.read = read;
        this.input = input;
    }

    @Override
    public void run(){
        read.readMethod(input);
    }
}
