package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> setCombination = new HashSet<>(firstSet);
        setCombination.addAll(secondSet);
        setCombination.addAll(thirdSet);
        return setCombination;
    }
}
