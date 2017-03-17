package client;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Game Started!");
		Scanner sc = new Scanner(System.in);
		System.out.println("ip:");
		String ip = sc.nextLine();
		System.out.println("port:");
		int port = sc.nextInt();
		
		Communicator cm = new Communicator(ip, port);
		cm.waitForData();
		
		while(cm.getMsg().isGameRuns()){
			System.out.println("Enter your number: ");
			cm.getMsg().setNumberPlayer2(sc.nextInt());
			cm.sendData();
			cm.waitForData();
		}
		

	}

}
