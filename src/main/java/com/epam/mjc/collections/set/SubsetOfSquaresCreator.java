package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> squareSet = new TreeSet<>();

        for (Integer x : sourceList) {
            squareSet.add(x * x);
        }

        NavigableSet<Integer> subsetOfSquares = squareSet.subSet(lowerBound, true, upperBound, true);

        return subsetOfSquares;
    }
}
