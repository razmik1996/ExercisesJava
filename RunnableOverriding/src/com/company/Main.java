package com.company;

public class Main {
    public static void main(String[] args) {
        new newThread();
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread is killed");
        }
        System.out.println("Main thread is ended");
    }
}

class newThread implements Runnable{
    Thread t;

    newThread() {
        t = new Thread(this, "thread 2");
        System.out.println("Subthread is created" + t);
        t.start();
    }

    public void run(){
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Subthread: "+i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e){
            System.out.println("Subtrade is kileed.");
        }
        System.out.println("Subtrade is ended.");
    }
}