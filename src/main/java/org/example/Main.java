package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("choose a - j or type 'exit' to quit:");
            String choice = scanner.nextLine();

            if (choice.equals("exit")) {
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
                    System.out.println("invalid choice!!!!!!!!!!");
            }
        }
    }
}