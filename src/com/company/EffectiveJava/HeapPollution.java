package com.company.EffectiveJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeapPollution {
//    ArrayList<String> temp = new ArrayList<String>();
//    temp.add("a");
//    temp.add("b");
//
//    HeapPollution.faultyMethod(temp);

    public static void faultyMethod(List<String>... l) {
        Object[] objectArray = l;     // Valid
        objectArray[0] = Arrays.asList(42);
        String s = l[0].get(0);       // ClassCastException thrown here
    }



}
