package com.company;

public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println(t);

        t.setName("Mine");
        System.out.println(t);

        try {
            for(int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("END");
        }
    }
}
