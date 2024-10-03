package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {

    @Test
    public void testCreation() {
        Human human = new Human("Kotoliy", "Orientalov", 31);
        assertEquals("Kotoliy", human.firstName());
        assertEquals("Orientalov", human.lastName());
        assertEquals(31, human.age());
    }

    @Test
    public void testCompareTo() {
        Human human1 = new Human("Kotoliy", "Orientalov", 31);
        Human human2 = new Human("Emelya", "Nikitosikov", 30);
        assertTrue(human1.compareTo(human2) > 0);
    }

    @Test
    public void testEquals() {
        Human human1 = new Human("Kotoliy", "Orientalov", 31);
        Human human2 = new Human("Kotoliy", "Orientalov", 31);
        assertEquals(human1, human2);
    }
}
