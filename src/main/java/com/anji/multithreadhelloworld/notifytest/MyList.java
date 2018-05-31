package com.anji.multithreadhelloworld.notifytest;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 等待/通知机制
 * author: chenqiang
 * date: 2018/5/31 14:20
 */
public class MyList {
    private static List<String> list=new ArrayList<String>();

    public static void add(){
        list.add("anyString");
    }

    public static int size(){
        return list.size();
    }
}
