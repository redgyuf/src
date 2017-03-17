package client;

import java.io.Serializable;

public class Message implements Serializable{
	private String player1;
	private String player2;
	
	private int point1;
	private int point2;
	
	private int numberPlayer2;
	
	private boolean isGameRuns;
	
	
	public boolean isGameRuns() {
		return isGameRuns;
	}

	public void setGameRuns(boolean isGameRuns) {
		this.isGameRuns = isGameRuns;
	}

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getPlayer2() {
		return player2;
	}

	public void setPlayer2(String player2) {
		this.player2 = player2;
	}

	public int getPoint1() {
		return point1;
	}

	public void setPoint1(int point1) {
		this.point1 = point1;
	}

	public int getPoint2() {
		return point2;
	}

	public void setPoint2(int point2) {
		this.point2 = point2;
	}

	public int getNumberPlayer2() {
		return numberPlayer2;
	}

	public void setNumberPlayer2(int numberPlayer2) {
		this.numberPlayer2 = numberPlayer2;
	}

	
}
