package edu.fa;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileSample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/home/hoang1306/students");
		Files.createDirectories(path);
		
		Path studentFile = Paths.get("/home/hoang1306/students.txt");
		if(!Files.exists(studentFile)){
			Files.createFile(studentFile);
		}else{
			System.out.println("File is existes");
		}
		String school = "Fresher Academy";
		byte[]data = school.getBytes();
		OutputStream out = null;
		try {
			out = new BufferedOutputStream(Files.newOutputStream(studentFile,
					StandardOpenOption.CREATE, StandardOpenOption.APPEND));
			out.write(data,0,data.length);
		}finally {
			if(out != null) {
				out.close();
			}
		}
		BufferedReader br = null;
		try {
			br = new BufferedReader(Files.newBufferedReader(studentFile));
			String line	= null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			if(br != null) {
				br.close();
			}
		}
		Files.delete(studentFile);
		Files.delete(path);
	}

}
