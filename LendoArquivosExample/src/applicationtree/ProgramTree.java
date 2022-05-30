package applicationtree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramTree {

	public static void main(String[] args) {
		String[] lines = new String[] { "Goord morning", "Good night" };
		
		String path = "c:\\Users\\jrobson\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
