package org.example.multithreading;

public class PriorityExample {
    public static void main(String[] args) {
        Priority priority1 = new Priority("High Priority");
        Priority priority2 = new Priority("Lower Priority");

        priority1.thread.setPriority(Thread.NORM_PRIORITY+2);
        priority2.thread.setPriority(Thread.NORM_PRIORITY-2);

        priority1.thread.start();
        priority2.thread.start();

        try {
            priority1.thread.join();
            priority2.thread.join();
        } catch (InterruptedException exc) {
            System.out.println("Main Thread Interrupting");
        }

        System.out.println("\nHigh priority thread counted to " + priority1.count);
        System.out.println("\nLower priority thread counted to " + priority2.count);

    }
}

class Priority implements Runnable {

    int count;
    Thread thread;
    static boolean stop = false;
    static String currentName;
    int id = 0;

    Priority(String name) {
        thread = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " starting...");

        do {
            count++;
            if(currentName.compareTo(thread.getName()) != 0) {
                currentName = thread.getName();
                System.out.println("In " + currentName);
            }
        } while (stop == false && count < 10000000);

        stop = true;
        System.out.println("\n" + thread.getName() + " terminating...");
    }
}