package com.company.others;

class Display {
    public synchronized void swipe (String name) {
        for (int i=0;i<5;i++) {
            try {
                System.out.println(name);
                Thread.sleep(2000);
            }catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}
class MyThread extends Thread {
    Display display;
    String name;

    MyThread(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    public void run () {
        display.swipe(name);
    }
}
public class SynchronizedThread {

    public static void main(String[] args) {
        Display display = new Display();
        MyThread thread = new MyThread(display, "Dhoni");
        MyThread thread1 = new MyThread(display, "Kholi");
        thread.start();
        thread1.start();
    }
}
