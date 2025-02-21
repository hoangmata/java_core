package edu.fa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedStreamSample {
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader("/home/hoang1306/input.txt"));
			pw = new PrintWriter(new FileWriter("/home/hoang1306/output.txt"));
			String line = null;
			while((line = br.readLine()) != null) {
				pw.println(line);
//				System.out.println(line);
			}
		}finally {
			if(br != null){
				br.close();
			}
			if(pw != null) {
				pw.close();
			}
		}
	}
}
