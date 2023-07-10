package org.example.Solid.good.i;

import java.util.Arrays;

public class StringComparisionImpl implements StringComparision {
    ReversalImpl reversetheString = new ReversalImpl();
    @Override
    public boolean isPalindrome(String text) {

        if (text.equalsIgnoreCase(reversetheString.reversetheString(text)))
        {
            return true;
        }else
            return false;
    }

    @Override
    public boolean isAnagram(String text1, String text2) {
        if (text1 == null || text2 == null || text1.length() != text2.length()) {
            return false;
        }
        char[] arr1 = text1.toLowerCase().toCharArray();
        char[] arr2 = text2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}