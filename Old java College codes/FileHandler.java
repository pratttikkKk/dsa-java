import java.io.*;
import java.util.Scanner;

public class FileHandler {
    public static void main(String[] args) {
        // Check if filename is provided as a command-line argument
        if (args.length < 1) {
            System.out.println("Usage: java FileHandler <filename>");
            return;
        }

        String filename = args[0];
        File file = new File(filename);

        try {
          
            if (file.exists()) {
                System.out.println("File exists. Displaying contents:\n");

                // Using FileReader and BufferedReader to read the file

                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }

                br.close();

                // Ask the user if they want to append data to the file
                Scanner sc = new Scanner(System.in);
                System.out.print("\nDo you want to append data to the file? (Yes/No): ");
                String response = sc.nextLine();

                if (response.equalsIgnoreCase("Yes")) {
                    // Open the file in append mode using FileWriter and BufferedWriter
                    FileWriter fw = new FileWriter(file, true);
                    BufferedWriter bw = new BufferedWriter(fw);

                    System.out.println("Enter data to append to the file (type 'exit' to finish):");

                    while (true) {
                        String inputLine = sc.nextLine();
                        if (inputLine.equalsIgnoreCase("exit")) {
                            break;
                        }
                        bw.write(inputLine);
                        bw.newLine(); // Add a new line after each input
                    }

                    bw.close();
                    System.out.println("Data appended successfully.");
                } else {
                    System.out.println("No data appended. Program terminated.");
                }

            } else {
                // If the file does not exist, create a new file and write user data
                System.out.println("File does not exist. Creating a new file: " + filename);

                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter data to write to the new file (type 'exit' to finish):");

                while (true) {
                    String inputLine = sc.nextLine();
                    if (inputLine.equalsIgnoreCase("exit")) {
                        break;
                    }
                    bw.write(inputLine);
                    bw.newLine(); // Add a new line after each input
                }

                bw.close();
                System.out.println("Data written to the new file successfully.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while handling the file:");
            e.printStackTrace();
        }
    }
}
