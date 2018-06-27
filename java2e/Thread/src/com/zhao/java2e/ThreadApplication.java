package com.zhao.java2e;

/**
 * Created by zhaoxj-b on 2018/5/9.
 */
public class ThreadApplication {
    public static void main(String [] args){
        System.out.println("hello world");
        RunnableDemo R1 = new RunnableDemo( "Thread-1");
        R1.start();

        RunnableDemo R2 = new RunnableDemo( "Thread-2");
        R2.start();
    }
}
