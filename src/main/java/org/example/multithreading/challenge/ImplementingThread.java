package org.example.multithreading.challenge;

public class ImplementingThread {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
    }
}

class MyThread extends Thread {
    MyThread() {
        super();
        start();
    }

    @Override
    public void run() {
        try {
            for(int count=0; count<5; count++) {
                Thread.sleep(100);
                System.out.println("Hello Multithreading!");
            }
        } catch (InterruptedException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
