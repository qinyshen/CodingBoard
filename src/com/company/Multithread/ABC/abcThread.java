package com.company.Multithread.ABC;


//new abcThread("A").start();
//new abcThread("B").start();
//new abcThread("C").start();
public class abcThread extends Thread{
    static int count = 0;
    String name;

    public abcThread(String name){
        this.name = name;
    }

    @Override
    public void run(){
        while(count < 30) {
            switch (count % 3) {
                case 0:
                    if ("A".equals(name)) {
                        printAndIncrease();
                    }
                    break;
                case 1:
                    if ("B".equals(name)) {
                        printAndIncrease();
                    }
                    break;
                case 2:
                    if ("C".equals(name)) {
                        printAndIncrease();
                    }
                    break;
            }

        }

    }


    private void printAndIncrease(){
        System.out.println(name);
        count+=1;
    }

}
