package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		String path = "C:\\Users\\bb8ga119\\Documents\\Eclipse-Workspace\\textFiles\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { //FileWriter(path, true) acrescenta e sem o true recria o arquivo
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
