package com.example.onenight;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Application;
import android.database.Cursor;

/*
 * û�м��ܡ�0�ż��ܡ�
 * �������˵��ƣ��Զ�����������1�ż��ܡ�
 * ���������ϵ��ƣ��Զ�����������2�ż��ܡ�
 * ��������������ҵĿ��ơ�3�ż��ܡ�
 * �Լ��������ϵ��ƽ��н�����4�ż��ܡ�
 * �Լ���������ҽ������ơ�5�ż��ܡ�
 * ����ʱ����ָ������һ�����һ��������6�ż��ܡ�
 * ����������ʤ����7�ż��ܡ�
 */
public class GameApplication extends Application {
	private GameDatabase GameSQL = new GameDatabase(this);
	private ArrayList<Characters> Character;
	private ArrayList<Player> Player;

	public ArrayList<Characters> getCharacter() {
		return Character;
	}

	public ArrayList<Player> getPlayer() {
		return Player;
	}

	GameDatabase characterdb;
	GameDatabase playerdb;

	@Override
	public void onCreate() {
		super.onCreate();
		GameSQL.insert("TABLE_CNAME", "Werewolf", null, null);
		GameSQL.insert("TABLE_CNAME", "Seer", null, null);
		GameSQL.insert("TABLE_CNAME", "Troublemaker", null, null);
		GameSQL.insert("TABLE_CNAME", "Robber", null, null);
		GameSQL.insert("TABLE_CNAME", "Lackeys", null, null);
		GameSQL.insert("TABLE_CNAME", "Insomniac", null, null);
		GameSQL.insert("TABLE_CNAME", "Drunk", null, null);
		GameSQL.insert("TABLE_CNAME", "Hunter", null, null);
		GameSQL.insert("TABLE_CNAME", "Cobbler", null, null);
		creatCharacter();
		creatPlayer();
	}

	public void creatCharacter() {
		CharactersFactory factory = new CharactersFactory();
		HashMap<String, String> character = new HashMap<String, String>();
		ArrayList<HashMap<String, String>> characterData = new ArrayList<HashMap<String, String>>();
		Cursor cursor = GameSQL.select("TABLE_CNAME");
		while (cursor.moveToNext()) {
			character.put("name", cursor.getString(0));
			characterData.add(character);
		}
		factory.creatCharacters(characterData);
		this.Character = factory.getCharacters();
	}

	public void creatPlayer() {
		PlayerFactory factory = new PlayerFactory();
		HashMap<String, String> player = new HashMap<String, String>();
		ArrayList<HashMap<String, String>> playerData = new ArrayList<HashMap<String, String>>();
		Cursor cursor = GameSQL.select("TABLE_PNAME");
		while (cursor.moveToNext()) {
			player.put("name", cursor.getString(0));
			player.put("seatNumber", cursor.getString(1));
			player.put("pictureName", cursor.getString(2));
			playerData.add(player);
		}
		factory.creatPlayerFromDatabase(playerData);
		this.Player = factory.getPlayer();

	}

}
