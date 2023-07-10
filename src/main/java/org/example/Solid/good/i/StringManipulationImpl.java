package org.example.Solid.good.i;

public class StringManipulationImpl implements StringManipulation {

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
}