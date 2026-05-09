import java.io.*;

public class TextFileAnalyzer {
    public static void main(String[] args) {
        // Check if filename is provided
        if (args.length < 1) {
            System.out.println("Usage: java TextFileAnalyzer <filename>");
            return;
        }

        String filename = args[0];
        int vowelCount = 0;
        int wordCount = 0;
        int aCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Count vowels and 'a's
                for (char ch : line.toLowerCase().toCharArray()) {
                    if ("aeiou".indexOf(ch) != -1) {
                        vowelCount++;
                    }
                    if (ch == 'a') {
                        aCount++;
                    }
                }

                // Count words
                String[] words = line.trim().split("\\s+");
                if (words.length == 1 && words[0].isEmpty()) {
                    // Line contains only whitespace
                    continue;
                }
                wordCount += words.length;
            }

            // Display results
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Occurrences of 'a': " + aCount);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file:");
            e.printStackTrace();
        }
    }
}
