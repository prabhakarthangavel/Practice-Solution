package com.company.others;

class MyThread1 extends Thread {
    int total = 0;
    public void run() {
        synchronized (this) {
            for (int i=0;i<100;i++) {
                total += i;
            }
            System.out.println("Running MyThread Thread");
            this.notify();
        }
    }

}
public class ThreadWaitAndNotifiy {

    public static void main(String[] args) throws InterruptedException {
        MyThread1 t = new MyThread1();
        t.start();
        System.out.println("Running Main Thread");
        synchronized (t) {
            t.wait();
            System.out.println(t.total);
        }
        System.out.println("Got notification");
    }
}
