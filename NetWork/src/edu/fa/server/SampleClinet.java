package edu.fa.server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SampleClinet {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 2025);
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF("Hello Java");
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
