package edu.fa;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketClient {
	public final static String SERVER_IP = "127.0.0.1";
	public final static int SERVER_PORT = 7;
	public static void main(String[] args) throws IOException, InterruptedException {
		Socket socket = null;
		try {
			socket = new Socket(SERVER_IP, SERVER_PORT);
			System.out.println("Connect socket: " + socket);
			
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			for (int i = '0'; i < '9'; i++) {
				os.write(i);
				int ch = is.read();
				System.out.println((char)ch + " ");
				Thread.sleep(200);
			}
		} catch (IOException e){
			System.out.println("Can't connect to server");
		}finally {
			if(socket != null) {
				socket.close();
			}
		}
	}
}
