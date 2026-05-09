import java.io.*;

public class copy {
    public static void main(String[] args) {
        String sourceFile = "sample.txt";
        String destFile   = "sample_copy.txt";

        try (FileInputStream  fin  = new FileInputStream(sourceFile);
             FileOutputStream fout = new FileOutputStream(destFile)) {

            int byteRead;
            while ((byteRead = fin.read()) != -1) {
                fout.write(byteRead);
            }
            System.out.println("File copied successfully from "
                               + sourceFile + " to " + destFile);

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}
