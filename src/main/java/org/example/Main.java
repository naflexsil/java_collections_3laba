package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter '1' for collections task, '2' for primes generator task, or 'exit' to quit:");
            String choice = scanner.nextLine();

            if (choice.equals("exit")) {
                break;
            }

            switch (choice) {
                case "1":
                    System.out.println("Running collections task...");
                    break;
                case "2":
                    System.out.println("Running primes generator task...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void handleCollectionsTasks(Scanner scanner) {
        while (true) {
            System.out.println("choose a - j or type 'back' to return to main menu:");
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
                    System.out.println("Invalid choice! Please choose a - j.");
            }
        }
    }
}
