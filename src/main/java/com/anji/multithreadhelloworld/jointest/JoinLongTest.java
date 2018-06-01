package com.anji.multithreadhelloworld.jointest;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/31 16:16
 */
public class JoinLongTest {
    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();

            Thread.sleep(2000);         //不会释放锁，TODO：是否释放锁暂时不理解什么意思
            //threadTest.join(2000);      //会释放锁，只等2秒，2秒过后不管threadTest有没有执行完毕，都执行下面的语句

            System.out.println("  end time=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static public class MyThread extends Thread {
        @Override
        public void run() {
            synchronized (this) {
                try {
                    System.out.println("begin time=" + System.currentTimeMillis());
                    Thread.sleep(10000);
                    System.out.println(" 2end time=" + System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
