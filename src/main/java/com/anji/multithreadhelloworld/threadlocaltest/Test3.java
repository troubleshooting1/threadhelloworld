package com.anji.multithreadhelloworld.threadlocaltest;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

import java.util.Date;

/**
 * Description: 验证线程变量间的隔离性
 * author: chenqiang
 * date: 2018/6/1 13:26
 */
public class Test3 {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在main线程中取值=" + Tools.t1.get());
                Tools.t1.set("bbb");
                Thread.sleep(1000);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    static public class Tools {
//        public static ThreadLocalExt t1 = new ThreadLocalExt();
//    }
//
//    static public class ThreadLocalExt extends ThreadLocal {
//        @Override
//        protected Object initialValue() {
//            return new Date().getTime();
//        }
//    }


//    static public class Tools {
//        public static InheritableThreadLocalExt t1 = new InheritableThreadLocalExt();
//    }
//
//    static public class InheritableThreadLocalExt extends InheritableThreadLocal {
//        @Override
//        protected Object initialValue() {
//            return new Date().getTime();
//        }
//    }


    static public class Tools {
        public static InheritableThreadLocalExt t1 = new InheritableThreadLocalExt();
    }

    static public class InheritableThreadLocalExt extends InheritableThreadLocal {
        @Override
        protected Object initialValue() {
            return new Date().getTime();
        }

        @Override
        protected Object childValue(Object parentValue) {
            return parentValue + "我在子线程加的";
        }
    }

    static public class ThreadA extends Thread {
        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("在ThreadA线程中取值=" + Tools.t1.get());
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
