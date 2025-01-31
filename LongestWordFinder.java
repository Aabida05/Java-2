package zestober;//20

import java.util.*;

public class LongestWordFinder {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
		System.out.println("Enter the element:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
		System.out.println("Enter the word:");
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }
		System.out.println("Enter the character:");
        char ch = scanner.next().charAt(0);
        
        String longestWord = "";
        for (String word : words) {
            if (word.startsWith(String.valueOf(ch))) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        System.out.println("Printing....");

        System.out.println(longestWord);

        scanner.close();
    }
}