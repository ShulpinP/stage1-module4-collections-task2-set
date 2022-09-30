package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();

        for (int x : sourceList) {
            int number = x;
            if (number % 2 == 0) {
                while (number % 2 == 0) {
                    result.add(number);
                    number = number / 2;
                    if (number == 1) {
                        result.add(number);
                    }
                }
            } else {
                result.add(x);
                result.add(x * 2);

            }
        }
        return result;
    }
}
