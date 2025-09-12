package example.study;

import java.io.File;
import java.io.FileReader;

public class FileNotFoundEX {

	public static void main(String[] args) {
		try {
			File file =new File("C:/Users/mones/Desktop/gitcommends.txt");
			FileReader fr = new FileReader(file);
			System.out.println("File Exist");
		}
		catch(Exception e) {
			System.out.println("file does not exist"+e);
		}
	}

}
