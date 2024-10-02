package org.example;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class PrimesGeneratorTest {

    @Test
    public void testPrimesGenerator() {
        int n = 5;
        PrimesGenerator generator = new PrimesGenerator(n);

        Iterator<Integer> iterator = generator.getIterator();
        Integer[] expectedPrimes = {2, 3, 5, 7, 11};
        int index = 0;
        while (iterator.hasNext()) {
            assertEquals(expectedPrimes[++index], iterator.next());
        }

        Iterator<Integer> reverseIterator = generator.getReverseIterator();
        Integer[] expectedPrimesReversed = {11, 7, 5, 3, 2};
        index = 0;
        while (reverseIterator.hasNext()) {
            assertEquals(expectedPrimesReversed[++index], reverseIterator.next());
        }
    }
}