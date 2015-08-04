package com.example.onenight;

import java.util.ArrayList;
import java.util.HashMap;

import android.graphics.Bitmap;

public class PlayerFactory {
	private ArrayList<Player> player = new ArrayList<Player>();

	public ArrayList<Player> getPlayer() {
		return player;
	}

	public void creatPlayer() {
		Player p = new Player();
		player.add(p);
	}

	public void creatPlayerFromDatabase(
			ArrayList<HashMap<String, String>> playerData) {
		player.clear();
		for (int i = 0; i < playerData.size(); i++) {
			int seatnumber = Integer.parseInt(playerData.get(i).get(
					"seatNumber"));
			String name = playerData.get(i).get("name");
			String Pname = playerData.get(i).get("picture");
			Bitmap bitmap = null;
			Player p = new Player();
			p.setName(name);
			p.setSeatNumber(seatnumber);
			p.setPicture(bitmap);
			player.add(p);
		}
	}
}
