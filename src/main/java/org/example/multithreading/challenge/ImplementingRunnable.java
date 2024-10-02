package org.example.multithreading.challenge;

public class ImplementingRunnable {
    public static void main(String[] args) {
        EvenNumbers even = new EvenNumbers();
        OddNumbers odd = new OddNumbers();
    }
}

class EvenNumbers implements Runnable {
    Thread thread;

    public EvenNumbers() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            for(int i=0; i<=10; i++) {
                if(i % 2 == 0) {
                    Thread.sleep(100);
                    System.out.println(i);
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(exc.getMessage());
        }
    }
}

class OddNumbers implements Runnable {
    Thread thread;

    public OddNumbers() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            for(int i=0; i<=10; i++) {
                if(i % 2 != 0) {
                    Thread.sleep(100);
                    System.out.println(i);
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
