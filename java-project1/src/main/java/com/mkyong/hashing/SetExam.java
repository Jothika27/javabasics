package com
.mkyong.hashing;

import java.util.HashSet;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<Integer>();
        s.add(5);
        s.add(4);
        s.add(4);
        s.add(8);
        System.out.println(s);
        s.size();
    }
}
