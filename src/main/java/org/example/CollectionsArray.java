package org.example;

import java.util.*;

public class CollectionsArray {
    private static final List<Integer> originalList = new ArrayList<>();
    private static List<Integer> currentList = new ArrayList<>();

    public static void createRandomArray() {
        Random random = new Random();
        originalList.clear();
        for (int i = 0; i < 20; ++i) {
            originalList.add(random.nextInt(101));
        }
        System.out.println("random array created: " + originalList);
        currentList = new ArrayList<>(originalList);
    }

    public static void convertArrayToList() {
        currentList = new ArrayList<>(originalList);
        System.out.println("list created from array: " + currentList);
    }

    public static void sortListAscending() {
        currentList = new ArrayList<>(originalList);
        Collections.sort(currentList);
        System.out.println("list sorted in ascending order: " + currentList);
    }

    public static void sortListDescending() {
        currentList = new ArrayList<>(originalList);
        currentList.sort(Collections.reverseOrder());
        System.out.println("list sorted in reverse order: " + currentList);
    }

    public static void shuffleList() {
        currentList = new ArrayList<>(originalList);
        Collections.shuffle(currentList);
        System.out.println("list shuffled: " + currentList);
    }

    public static void cyclicShift() {
        currentList = new ArrayList<>(originalList);
        Collections.rotate(currentList, 1);
        System.out.println("list after cyclic shift: " + currentList);
    }

    public static void keepUniqueElements() {
        currentList = new ArrayList<>(originalList);
        Set<Integer> uniqueSet = new HashSet<>(currentList);
        currentList.clear();
        currentList.addAll(uniqueSet);
        System.out.println("list with unique elements: " + currentList);
    }

    public static void keepDuplicateElements() {
        currentList = new ArrayList<>(originalList);
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : currentList) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        currentList.clear();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                currentList.add(entry.getKey());
            }
        }
        System.out.println("list with duplicate elements: " + currentList);
    }

    public static void convertListToArray() {
        Integer[] array = currentList.toArray(new Integer[0]);
        System.out.println("converted to array: " + Arrays.toString(array));
    }

    public static void countOccurrences() {
        currentList = new ArrayList<>(originalList);
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : currentList) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("occurrences of each number: " + frequencyMap);
    }

    public static List<Integer> getOriginalList() {
        return new ArrayList<>(originalList);
    }
    public static List<Integer> getCurrentList() {
        return new ArrayList<>(currentList);
    }
}
