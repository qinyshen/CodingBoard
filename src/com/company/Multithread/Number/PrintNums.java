package com.company.Multithread.Number;

import java.util.concurrent.atomic.AtomicBoolean;

public class PrintNums extends Thread {
    private int[] nums;
    private AtomicBoolean isNum;

    public PrintNums(int[] a1, AtomicBoolean isNum) {
        this.nums = a1;
        this.isNum = isNum;
    }

    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!isNum.get()) {
                Thread.yield();
            }
            System.out.print(nums[i]);
            count++;
            if (count == 2) {
                count = 0;
                isNum.set(false);
            }
        }
        isNum.set(false);
    }
}