package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimesGenerator {
    private final List<Integer> primes;

    public PrimesGenerator(int n) {
        primes = generatePrimes(n);
    }

    private List<Integer> generatePrimes(int n) {
        List<Integer> primeList = new ArrayList<>();
        int num = 2;
        while (primeList.size() < n) {
            if (isPrime(num)) {
                primeList.add(num);
            }
            num++;
        }
        return primeList;
    }

    private boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public Iterator<Integer> getIterator() {
        return primes.iterator();
    }

    public Iterator<Integer> getReverseIterator() {
        return new ReverseIterator(primes);
    }

    private static class ReverseIterator implements Iterator<Integer> {
        private final List<Integer> list;
        private int currentIndex;

        public ReverseIterator(List<Integer> list) {
            this.list = list;
            this.currentIndex = list.size() - 1;
        }

        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public Integer next() {
            return list.get(currentIndex--);
        }
    }
}