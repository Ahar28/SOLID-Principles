package org.example.Solid.bad.i;

import java.util.Map;
import java.util.Scanner;

    public class ISP_bad {

    public static void main(String[] args) {

        StringMethodsIMP stringMethodsIMP = new StringMethodsIMP();
        String text1 = "Koenigsegg is a renowned Swedish hypercar manufacturer known for pushing the boundaries of automotive engineering and performance. Founded by Christian von Koenigsegg in 1994, the company has produced some of the most exclusive and technologically advanced supercars in the world. Koenigsegg's vehicles are characterized by their striking design, exceptional speed, and relentless pursuit of innovation. Each car is meticulously handcrafted, showcasing the brand's commitment to precision and craftsmanship. With limited production runs and extraordinary powertrains, Koenigsegg cars have become symbols of automotive excellence and a dream for enthusiasts worldwide.";
        String text2 = "aharnish";
        int choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("Welcome to String Operations");
            System.out.println("Select which operation would you like to perform on the String ");
            System.out.println("1. Count Characters in a String");
            System.out.println("2. Reverse the string");
            System.out.println("3. Check if two Strings are palindrome or not");
            System.out.println("4. Cont the number of words in String ");
            System.out.println("5. Capitlize Strnig");
            System.out.println("6. check if two Strings are anagram or not");
            System.out.println("7. Count frequency of characters in a String");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("There are " + stringMethodsIMP.CharacterCount(text1) + " characters in the text: " + "\n" + "\"" + text1 + "\"");
                    break;
                case 2:
                    System.out.println("The reversed String of "+text2+" is "+stringMethodsIMP.stringReversal(text2));
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("Enter String 1 : ");
                    String userInput = scanner.nextLine();
                    if ( stringMethodsIMP.isPalindrome(userInput)==true) {
                        System.out.println("Stirng "+userInput+" is Palindome");
                    }else{
                        System.out.println("Not palindrome");
                    }
                    break;
                case 4:
                    System.out.println("There are "+stringMethodsIMP.wordCount(text1)+" number of words in the text");
                    break;
                case 5:
                    System.out.println("Capitalized String is "+"\""+stringMethodsIMP.capitalizeWords(text1)+"\"");
                    break;
                case 6:
                    scanner.nextLine();
                    System.out.print("Enter String 1 : ");
                    String userInput1 = scanner.nextLine();
                    System.out.print("Enter String 2 : ");
                    String userInput2 = scanner.nextLine();
                    if ( stringMethodsIMP.isAnagram(userInput1, userInput2)==true) {
                        System.out.println("Stirng "+userInput1+" & "+userInput2+" are anagrams");
                    }else{
                        System.out.println("Not anagram");
                    }
                    break;
                case 7:
                    Map<Character, Integer> countCharacterFrequency = stringMethodsIMP.charFreq(text1);
                    System.out.println("Character Frequency:");
                    for (Map.Entry<Character, Integer> entry : countCharacterFrequency.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                case 8:
                    System.out.println("Program exited Successfuly");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 7);
        scanner.close();
    }
}