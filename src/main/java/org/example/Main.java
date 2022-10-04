package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String txt;
        String word = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your text: ");
        txt = scanner.nextLine();
        char [] letters = txt.toCharArray();
        int size = letters.length;
        System.out.print("Your reverse text is: ");
        for (int i = 0; i < size; i++) {
            if (letters[i] != ' ') {
                word = word + letters[i];
            } else {
                for (int y = word.length(); y > 0; y--) {
                    System.out.print(word.charAt(y-1));
                }
                System.out.print(" ");
                word = "";
            }
        }
        for (int c = word.length(); c > 0; c--) {
            System.out.print(word.charAt(c-1));
        }
        scanner.close();
    }
}