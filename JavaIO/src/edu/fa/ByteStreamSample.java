package edu.fa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamSample {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("/home/hoang1306/input.txt");
			fos = new FileOutputStream("/home/hoang1306/onput.txt");
			int c = 0;
			while((c = fis.read()) != -1) {
				fos.write(c);
			}
		}finally {
			if(fis != null) {
				fis.close();
			}
			if(fos != null) {
				fos.close();
			}
			System.out.println("End!");
		}

	}

}
