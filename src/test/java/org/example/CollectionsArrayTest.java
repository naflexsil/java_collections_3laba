package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CollectionsArrayTest {

    @BeforeEach
    public void setUp() {
        CollectionsArray.createRandomArray();
    }

    @Test
    public void testCreateRandomArray() {
        List<Integer> originalList = CollectionsArray.getOriginalList();
        assertNotNull(originalList);
        assertEquals(20, originalList.size());
    }

    @Test
    public void testSortListAscending() {
        CollectionsArray.sortListAscending();
        List<Integer> sortedList = CollectionsArray.getCurrentList();
        assertTrue(isSortedAscending(sortedList));
    }

    @Test
    public void testSortListDescending() {
        CollectionsArray.sortListDescending();
        List<Integer> sortedList = CollectionsArray.getCurrentList();
        assertTrue(isSortedDescending(sortedList));
    }

    @Test
    public void testShuffleList() {
        List<Integer> originalList = CollectionsArray.getOriginalList();
        CollectionsArray.shuffleList();
        List<Integer> shuffledList = CollectionsArray.getCurrentList();
        assertNotEquals(originalList, shuffledList);
    }

    @Test
    public void testCyclicShift() {
        CollectionsArray.cyclicShift();
        List<Integer> shiftedList = CollectionsArray.getCurrentList();
        assertEquals(CollectionsArray.getOriginalList().size(), shiftedList.size());
    }

    private boolean isSortedAscending(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; ++i) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
    private boolean isSortedDescending(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; ++i) {
            if (list.get(i) < list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}