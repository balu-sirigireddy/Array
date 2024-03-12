package com.Kodnest.Array;
import java.util.HashMap;
import java.util.Scanner;

public class Array {

    public static int countNonRepeatedCharacters(String str) {
        // If the string is empty, return 0
        if (str.isEmpty()) {
            return 0;
        }

        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCounts = new HashMap<>();

        // Count occurrences of each character in the string
        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Count the number of non-repeated characters
        int nonRepeatedCount = 0;
        for (char c : str.toCharArray()) {
            if (charCounts.get(c) == 1) {
                nonRepeatedCount++;
            }
        }

        return nonRepeatedCount;
    }

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate the count of non-repeated characters
        int result = countNonRepeatedCharacters(input);

        // Display the result
        System.out.println("Count of non-repeated characters: " + result);
    }
}
