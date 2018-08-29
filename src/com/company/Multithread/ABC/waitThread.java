package com.company.Multithread.ABC;


import java.util.concurrent.atomic.AtomicReference;

//使用synchronized, wait和notifyAll
public class waitThread extends Thread {
    int count = 0;
    String name;

    public waitThread(String name){
        this.name = name;
    }

    private static AtomicReference next = new AtomicReference("A");
//    private static volatile String next = "A";

    private void nextStr(AtomicReference next){
        if(next.toString().equals("A")){
            next.set("B");
        }

        if(next.toString().equals("B")){
            next.set("C");
        }
        next.set("A");
    }

    @Override
    public void run(){
        while(count < 10) {
            synchronized(next){
                while(!next.toString().equals(name)){
                    try{
                        next.wait();
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }

                }
                printAndIncrease();
                nextStr(next);
                next.notifyAll();
            }

        }
    }

    private void printAndIncrease(){
        System.out.println(name);
        count+=1;
    }
}
