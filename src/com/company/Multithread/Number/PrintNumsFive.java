package com.company.Multithread.Number;


//new Thread(new PrintNumsFive(1)).start();
//new Thread(new PrintNumsFive(2)).start();
//new Thread(new PrintNumsFive(3)).start();
public class PrintNumsFive extends Thread {
    private static volatile int printNum = 0;
    private int threadId;

    public PrintNumsFive(int threadId){
        this.threadId = threadId;
    }

    @Override
    public void run() {
        while(printNum < 75) {
            synchronized (PrintNumsFive.class){
                if((printNum/5)%3+ 1 == threadId){
                    for (int i = 0; i <5; i++) {
                        System.out.println("线程"+threadId+":"+(++printNum));
                    }
                    PrintNumsFive.class.notifyAll();
                }
                else{
                    try {
                        PrintNumsFive.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }
        }
    }
}