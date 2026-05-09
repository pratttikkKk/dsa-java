import java.io.*;

class Displayfile {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("sample.txt");
            int a;
            while ((a = fin.read()) != -1) {
                char ch = (char) a;
                System.out.print(ch); 
            }
            fin.close(); 
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("IO Error: " + e);
        }
    }
}
