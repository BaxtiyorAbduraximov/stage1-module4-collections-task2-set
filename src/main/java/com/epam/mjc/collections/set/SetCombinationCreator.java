package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> setCombination = new HashSet<>(firstSet);
        setCombination.retainAll(secondSet); // Keep only elements that are in both firstSet and secondSet
        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);
        setCombination.addAll(thirdSet); // Add elements from thirdSet that are not in firstSet or secondSet
        return setCombination;
    }
}
