package org.example;

import java.util.Iterator;

public class PrimesGeneratorTest {
    public static void printPrimes(int n) {
        PrimesGenerator generator = new PrimesGenerator(n);

        System.out.println("first " + n + " prime numbers:");
        for (int prime : generator) {
            System.out.print(prime + " ");
        }
        System.out.println();

        System.out.println("first " + n + " prime number in reverse order:");
        Iterator<Integer> reverseIterator = generator.reverseIterator();
        while (reverseIterator.hasNext()) {
            System.out.print(reverseIterator.next() + " ");
        }
        System.out.println();
    }
}