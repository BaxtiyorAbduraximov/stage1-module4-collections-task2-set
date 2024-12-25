package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>(sourceList);

        for (Integer x : sourceList) {
            if(x % 2 == 0) {
                while(x % 2 == 0){
                    hashSet.add(x);
                    x = x / 2;
                }
                hashSet.add(x);
            }
            else {
                hashSet.add(x);
                hashSet.add(x * 2);
            }
        }

        return hashSet;
    }
}
