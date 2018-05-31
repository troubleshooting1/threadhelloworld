package com.anji.multithreadhelloworld.pipedstreamtest;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/31 15:23
 */
public class WriteData {
    public void writeMethod(PipedOutputStream out) {
        try {
            System.out.println("write: ");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                out.write(outData.getBytes());
                System.out.println(outData);
            }
            System.out.println("------------------以上为writeMethod输出内容(字符)----------------");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
