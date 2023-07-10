package org.example.Solid.good.i;

import java.util.HashMap;
import java.util.Map;

public class StringTraversalImpl implements StringTraversal {
    @Override
    public int wordCount(String text) {
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    @Override
    public int CharacterCount(String text) {
        System.out.println(text.length());
        return text.length();
    }

    @Override
    public Map<Character, Integer> charFreq(String text) {
        Map<Character, Integer> characterIntegerMap = new HashMap<Character, Integer>();

        for (char c : text.toCharArray()) {
            characterIntegerMap.put(c, characterIntegerMap.getOrDefault(c, 0) + 1);
        }

        return characterIntegerMap;
    }
}