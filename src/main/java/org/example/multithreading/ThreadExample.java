package org.example.multithreading;

public class ThreadExample {
    public static void main(String[] args) {
        System.out.println("** Main Thread Start **");
        MyThread firstThread = new MyThread("First Thread");
        MyThread secondThread = new MyThread("Second Thread");
        MyThread thirdThread = new MyThread("Third Thread");
        System.out.println("** Main Thread Finished **");
    }
}

class MyThread extends Thread {
    MyThread(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " starting...");
        try {
            for(int count=0; count<5; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() + ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(getName() + " interrupting...");
        }

        System.out.println(getName() + " terminating...");
    }
}