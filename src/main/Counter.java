package main;

public class Counter {
	
	static int clicks = 0;
	
	// Click incrementer
	public void clickIncrement() {
		clicks++;
	}
	
	public static int getClicks() {
		return clicks;
	}
}
