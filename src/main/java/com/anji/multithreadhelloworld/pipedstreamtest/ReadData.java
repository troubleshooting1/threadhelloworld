package com.anji.multithreadhelloworld.pipedstreamtest;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/31 15:25
 */
public class ReadData {
    public void readMethod(PipedInputStream input) {
        try {
            System.out.println("read: ");
            byte[] byteArray = new byte[20];
            int readLength = input.read(byteArray);
            while (readLength != -1) {
                String newData = new String(byteArray, 0, readLength);
                System.out.println(newData);
                readLength = input.read(byteArray);
            }
            System.out.println("------------------以上为readMethod输出内容（字节）----------------");
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
