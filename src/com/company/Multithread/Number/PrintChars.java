package com.company.Multithread.Number;

import java.util.concurrent.atomic.AtomicBoolean;



//AtomicBoolean isNum = new AtomicBoolean(true);
//int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//char[] chars = { 'a', 'b', 'c', 'd', 'e' };
//new PrintNums(nums, isNum).start();
//new PrintChars(chars, isNum).start();

public class PrintChars extends Thread {
    private char[] chars;
    private AtomicBoolean isNum;

    public PrintChars(char[] a2, AtomicBoolean isNum) {
        this.chars = a2;
        this.isNum = isNum;
    }

    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            while (isNum.get()) {
                Thread.yield();
            }
            System.out.print(chars[i]);
            count++;
            if (count == 1) {
                count = 0;
                isNum.set(true);
            }
        }
        isNum.set(true);
    }
}