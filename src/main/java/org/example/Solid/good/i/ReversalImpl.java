package org.example.Solid.good.i;

public class ReversalImpl implements Reversal {
    @Override
    public String reversetheString(String text) {
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
}