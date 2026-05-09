
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteExample{

	public static void main(String[] args) {
		String filename  ="sample__W&R.txt";

		try {
			FileWriter wr= new FileWriter(filename);
			wr.write("my name is pratik \n i am an engineer.");
			wr.close();
			
		} catch (IOException e) {
			System.out.println("error writing the file " +e.getMessage());
		} finally {
			System.out.println("always executed block!!");
		}
		try {
			FileReader fr =new FileReader(filename);
			 BufferedReader br = new BufferedReader(fr);

		String line;
			
		while((line=br.readLine())!=null) { 
		System.out.println(line);	
		}
		br.close();
		fr.close();
		} catch (Exception e) {
			System.out.println("file not found");		}
	}
}
