package client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Communicator {
	private Socket sc;
	private ObjectOutputStream os;
	private ObjectInputStream is;
	private Message msg;
	
	
	public Communicator(String ip, int port){
		try {
			sc = new Socket(ip, port);
			os = new ObjectOutputStream(sc.getOutputStream());
			is = new ObjectInputStream(sc.getInputStream());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void waitForData(){
		System.out.println("Waiting for server!");
		try {
			msg = (Message) is.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void sendData(){
		System.out.println("Sending data to server!");
		try {
			os.writeObject(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
