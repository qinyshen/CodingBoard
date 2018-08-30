package com.company.LeetCode;

import java.util.HashSet;
import java.util.List;

public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet set = new HashSet<String>(wordDict);
        boolean[] f = new boolean[s.length() + 1];
        f[0] = true;

        for(int i = 1; i < s.length() + 1; i++){
            for(int j=0; j < i; j++){
                if(f[j] && set.contains(s.substring(j, i))){
                    f[i] = true;
                    break;
                }
            }
        }

        return f[s.length()];

    }

}
