package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapMap {
    public static <K, V> Map<V, K> swapKeysAndValues(Map<K, V> inputMap) {
        Map<V, K> swappedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : inputMap.entrySet()) {
            swappedMap.put(entry.getValue(), entry.getKey());
        }
        return swappedMap;
    }

    public static void handleSwapTask() {
        Map<Integer, String> exampleMap = new HashMap<>();
        exampleMap.put(1, "ban");
        exampleMap.put(2, "banan");
        exampleMap.put(3, "nana");

        System.out.println("original map: " + exampleMap);
        Map<String, Integer> swappedMap = swapKeysAndValues(exampleMap);
        System.out.println("swapped map: " + swappedMap);
    }
}