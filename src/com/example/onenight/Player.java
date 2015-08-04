package com.example.onenight;

import android.graphics.Bitmap;

public class Player {
	private boolean Killed;
	private String name;
	private int SeatNumber;

	public void setName(String name) {
		this.name = name;
	}

	public void setSeatNumber(int seatNumber) {
		SeatNumber = seatNumber;
	}

	public void setPicture(Bitmap picture) {
		this.picture = picture;
	}

	private Characters character;
	private Bitmap picture;

	public Bitmap getPicture() {
		return picture;
	}

	public Characters getCharacter() {
		return character;
	}

	public void setCharacter(Characters character) {
		this.character = character;
	}

	public int getSeatNumber() {
		return SeatNumber;
	}

	public String getName() {
		return name;
	}

	public boolean isKilled() {
		return Killed;
	}

	public void setKilled(boolean killed) {
		Killed = killed;
	}
}
