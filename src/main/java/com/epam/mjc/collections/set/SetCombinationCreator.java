package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> firstAndSecond = new HashSet<>();
        HashSet<String> result = new HashSet<>() {
        };
        for (String str : firstSet) {
            if (secondSet.contains(str)) {
                firstAndSecond.add(str);
            }
        }
        for (String srt : firstAndSecond) {
            if (!thirdSet.contains(srt)) {
                result.add(srt);
            }
        }
        for (String srt : thirdSet) {
            if (!firstAndSecond.contains(srt)) {
                result.add(srt);
            }
        }
        return result;
    }
}