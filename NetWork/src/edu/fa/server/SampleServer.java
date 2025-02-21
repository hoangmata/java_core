package edu.fa.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SampleServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(2025);
			System.out.println("Server is availabel on the 2025 port");
			Socket socket = server.accept();
			InputStream inputStream = socket.getInputStream();
			DataInputStream dis = new DataInputStream(inputStream);
			String message = dis.readUTF();
			System.out.println(message);
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
