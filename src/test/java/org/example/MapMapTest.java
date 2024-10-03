package org.example;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class MapMapTest {
    @Test
    public void testSimpleSwap() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("ban", 1);
        inputMap.put("banan", 2);
        inputMap.put("nana", 3);

        Map<Integer, String> result = MapMap.swapKeysAndValues(inputMap);

        assertEquals("ban", result.get(1));
        assertEquals("banan", result.get(2));
        assertEquals("nana", result.get(3));
    }

    @Test
    public void testEmptyMap() {
        Map<String, Integer> inputMap = new HashMap<>();

        Map<Integer, String> result = MapMap.swapKeysAndValues(inputMap);

        assertTrue(result.isEmpty());
    }
}