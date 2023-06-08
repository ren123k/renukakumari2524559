package com.anaplan.main;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DictionaryApp {

    private static List<String> dictionaryWords;

    public static void main(String[] args) {
        loadDictionary("Dictionary.txt");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Dictionary Application");
            System.out.println("-----------------------");
            System.out.println("1. Find words starting with a to m");
            System.out.println("2. Find words starting with the letter n at the end of the Dictionary");
            System.out.println("3. Group words by their first letters");
            System.out.println("4. Find palindromes in the Dictionary");
            System.out.println("5. Count vowels used in words");
            System.out.println("6. Find the longest word in the Dictionary");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    findWordsStartsWithAToM();
                    break;
                case 2:
                    findWordsStartsWithNAtEnd();
                    break;
                case 3:
                    groupWordsByFirstLetter();
                    break;
                case 4:
                    findPalindromes();
                    break;
                case 5:
                    countVowels();
                    break;
               /* case 6:
                    findLongestWord();
                    break;*/
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        } while (choice != 0);
    }

    private static void loadDictionary(String filePath) {
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            dictionaryWords = stream.collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("Failed to load dictionary file: " + e.getMessage());
        }
    }

    private static void findWordsStartsWithAToM() {
        List<String> words = dictionaryWords.stream()
                .filter(word -> word.toLowerCase().matches("[a-m].*"))
                .collect(Collectors.toList());

        System.out.println("Words starting with a to m:");
        words.forEach(System.out::println);
    }

    private static void findWordsStartsWithNAtEnd() {
        List<String> words = dictionaryWords.stream()
                .filter(word -> word.toLowerCase().matches(".*n$"))
                .collect(Collectors.toList());

        System.out.println("Words starting with the letter n at the end of the Dictionary:");
        words.forEach(System.out::println);
    }

    private static void groupWordsByFirstLetter() {
        Map<Character, List<String>> groupedWords = dictionaryWords.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));

        System.out.println("Grouped words by their first letters:");
        groupedWords.forEach((letter, words) -> {
            System.out.println(letter + ":");
            words.forEach(System.out::println);
        });
    }

    private static void findPalindromes() {
        List<String> palindromes = dictionaryWords.stream()
                .filter(word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString()))
                .collect(Collectors.toList());

        System.out.println("Palindromes in the Dictionary:");
        palindromes.forEach(System.out::println);
    }

    private static void countVowels() {

    }

}