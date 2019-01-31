package main;

public class Main {

	private static Counter clickCounter;

	public static void main(String[] args) {
	
		setClickCounter(new Counter());
		
	}

	public static Counter getClickCounter() {
		return clickCounter;
	}

	public static void setClickCounter(Counter clickCounter) {
		Main.clickCounter = clickCounter;
	}
}
