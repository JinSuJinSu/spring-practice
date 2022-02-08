package com.poscoict.container.videosystem;

public class IronMan implements DigitalVideoDisc {
	private String studio = "MARVEL";
	private String title = "ironMan";
	
	public void play() {
		System.out.println("Playing Movie " + studio + "'s " + title);
	}
}