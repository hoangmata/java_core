package edu.fa;

import java.io.File;
import java.io.IOException;

public class FileSample{
	public static void main(String[] args) throws IOException{
		File file =new File("/home/user_name/sample.txt");
		file.createNewFile();
		
		File dir = new File("/home/user_name/name");
		dir.mkdir();
		System.out.println(file.exists());
		System.out.println(dir.exists());
		file.delete();
		dir.delete();
	}
}
