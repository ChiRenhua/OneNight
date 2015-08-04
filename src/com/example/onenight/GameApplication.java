package com.example.onenight;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Application;
import android.database.Cursor;

/*
 * 没有技能【0号技能】
 * 翻看别人的牌（自定义数量）【1号技能】
 * 翻看桌面上的牌（自定义数量）【2号技能】
 * 交换任意两名玩家的卡牌【3号技能】
 * 自己与桌面上的牌进行交换【4号技能】
 * 自己与其他玩家交换卡牌【5号技能】
 * 死亡时可以指认任意一名玩家一起死亡【6号技能】
 * 死亡即宣布胜利【7号技能】
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
