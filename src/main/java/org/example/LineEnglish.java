package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LineEnglish {
    public static void countWordFrequencies(String text) {
        // приводим текст к ниж. регистру и раздел. по пробелам и знакам препинания
        String[] words = text.toLowerCase().split("\\W+");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (word.isEmpty()) continue;
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("word frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void handleWordFrequencyTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter text:");
        String text = scanner.nextLine();
        countWordFrequencies(text);
    }
}
