package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("enter '1' for task with Collections, '2' for PrimesGenerator or 'exit':");
            String choice = scanner.nextLine();

            if (choice.equals("exit")) {
                break;
            }

            switch (choice) {
                case "1":
                    System.out.println("Collections task");
                    handleCollectionsTasks(scanner);
                    break;
                case "2":
                    System.out.println("enter number of prime numbers to generate:");
                    int n = Integer.parseInt(scanner.nextLine());
                    PrimesGeneratorTest.printPrimes(n);
                    break;
                default:
                    System.out.println("error!!!!!!!");
            }
        }
    }

    private static void handleCollectionsTasks(Scanner scanner) {
        while (true) {
            System.out.println("enter a - j or 'back' return to menu:");
            String choice = scanner.nextLine();

            if (choice.equals("back")) {
                break;
            }

            switch (choice) {
                case "a":
                    CollectionsArray.createRandomArray();
                    break;
                case "b":
                    CollectionsArray.convertArrayToList();
                    break;
                case "c":
                    CollectionsArray.sortListAscending();
                    break;
                case "d":
                    CollectionsArray.sortListDescending();
                    break;
                case "e":
                    CollectionsArray.shuffleList();
                    break;
                case "f":
                    CollectionsArray.cyclicShift();
                    break;
                case "g":
                    CollectionsArray.keepUniqueElements();
                    break;
                case "h":
                    CollectionsArray.keepDuplicateElements();
                    break;
                case "i":
                    CollectionsArray.convertListToArray();
                    break;
                case "j":
                    CollectionsArray.countOccurrences();
                    break;
                default:
                    System.out.println("error!!!!!!! enter a - j");
            }
        }
    }
}

