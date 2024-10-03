package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimesGenerator implements Iterable<Integer> {
    private final List<Integer> primes;

    public PrimesGenerator(int n) {
        primes = new ArrayList<>();
        generatePrimes(n);
    }

    private void generatePrimes(int n) {
        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                primes.add(num);
                ++count;
            }
            ++num;
        }
    }

    private boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Iterator<Integer> iterator() {
        return primes.iterator();
    }

    public Iterator<Integer> reverseIterator() {
        return new Iterator<>() {
            private int currentIndex = primes.size() - 1;

            @Override
            public boolean hasNext() {
                return currentIndex >= 0;
            }

            @Override
            public Integer next() {
                return primes.get(currentIndex--);
            }
        };
    }
}