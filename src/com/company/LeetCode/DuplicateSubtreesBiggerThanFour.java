package com.company.LeetCode;

import java.util.HashSet;

public class DuplicateSubtreesBiggerThanFour {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private boolean find = false;



    public boolean  hasDuplicateSubtreesBiggerThanFour(TreeNode root) {
        postorder(root, new HashSet<String>(), "");
        return find;
    }

    public int postorder(TreeNode cur, HashSet<String> set,  String str) {
        if(find) return 0;

        if (cur == null){
            return 0;
        }

        int length = 1;

        String serial = cur.val + ",";

        length += postorder(cur.left, set, serial);
        length += postorder(cur.right, set, serial);

        if(length >= 4){
            if(set.contains(serial)){
                find = true;
                return 0;
            }
            else{
                set.add(serial);
            }
        }

        return length;
    }



}
