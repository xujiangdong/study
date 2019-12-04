package com.example.javabase.ThreadTest;

/**
 * @author XuJD
 * @create 2019-04-02 19:04
 **/
public class A implements Runnable {
    @Override
    public void run() {
        System.out.println("1111111111--"+Thread.currentThread().getName());
    }


    public static void main(String[] args){
        Thread t = new Thread(new A());
        t.start();
        t.run();
    }
}
