package org.example.Solid.bad.i;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringMethodsIMP implements StringMethods{
    @Override
    public int CharacterCount(String text) {
        System.out.println(text.length());
        return text.length();
    }

    @Override
    public String stringReversal(String text) {
        char[] charArray = text.toCharArray();
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }

    @Override
    public boolean isPalindrome(String text) {
        if (text.equalsIgnoreCase(stringReversal(text)))
        {
            return true;
        }else
        return false;
    }

    @Override
    public int wordCount(String text) {
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    @Override
    public String capitalizeWords(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        String[] noOfWords = text.trim().split("\\s+");
        StringBuilder words = new StringBuilder();

        for (String word : noOfWords) {
            char firstChar = Character.toUpperCase(word.charAt(0));
            String capitalizedWord = firstChar + word.substring(1);
            words.append(capitalizedWord).append(" ");
        }
        return words.toString().trim();
    }

    @Override
    public boolean isAnagram(String text1,String text2) {
        if (text1 == null || text2 == null || text1.length() != text2.length()) {
            return false;
        }
        char[] arr1 = text1.toLowerCase().toCharArray();
        char[] arr2 = text2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
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