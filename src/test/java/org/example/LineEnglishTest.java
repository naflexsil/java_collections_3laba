package org.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class LineEnglishTest {
    @Test
    public void testCountWordFrequencies() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        String text = "Banan, banan! oke oke or la la?";

        LineEnglish.countWordFrequencies(text);

        String output = outContent.toString().trim();

        String[] expectedWords = {"banan: 2", "oke: 2", "or: 1", "la: 2"};

        for (String expected : expectedWords) {
            assertTrue(output.contains(expected), expected);
        }
    }
}