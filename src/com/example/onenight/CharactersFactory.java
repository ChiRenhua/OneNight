package com.example.onenight;

import java.util.ArrayList;
import java.util.HashMap;

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
public class CharactersFactory {
	private ArrayList<Characters> characters = new ArrayList<Characters>();// 用来存放已经实例化好的角色

	public ArrayList<Characters> getCharacters() {
		return characters;
	}

	/*
	 * 实例化角色
	 */
	public void creatCharacters(ArrayList<HashMap<String, String>> characterData) {
		for (int i = 0; i < characterData.size(); i++) {
			if (characterData.get(i).get("name") == "Werewolf") {
				if (characterData.get(i).get("state") == "true") {
					Characters werewolf = new Werewolf();
					characters.add(werewolf);
				}
			} else if (characterData.get(i).get("name") == "Seer") {
				if (characterData.get(i).get("state") == "true") {
					Characters seer = new Seer();
					characters.add(seer);
				}
			} else if (characterData.get(i).get("name") == "Troublemaker") {
				if (characterData.get(i).get("state") == "true") {
					Characters troublemaker = new Troublemaker();
					characters.add(troublemaker);
				}
			} else if (characterData.get(i).get("name") == "Robber") {
				if (characterData.get(i).get("state") == "true") {
					Characters robber = new Robber();
					characters.add(robber);
				}
			} else if (characterData.get(i).get("name") == "Lackeys") {
				if (characterData.get(i).get("state") == "true") {
					Characters lackeys = new Lackeys();
					characters.add(lackeys);
				}
			} else if (characterData.get(i).get("name") == "Insomniac") {
				if (characterData.get(i).get("state") == "true") {
					Characters insomniac = new Insomniac();
					characters.add(insomniac);
				}
			} else if (characterData.get(i).get("name") == "Drunk") {
				if (characterData.get(i).get("state") == "true") {
					Characters drunk = new Drunk();
					characters.add(drunk);
				}
			} else if (characterData.get(i).get("name") == "Hunter") {
				if (characterData.get(i).get("state") == "true") {
					Characters hunter = new Hunter();
					characters.add(hunter);
				}
			} else if (characterData.get(i).get("name") == "Cobbler") {
				if (characterData.get(i).get("state") == "true") {
					Characters cobbler = new Cobbler();
					characters.add(cobbler);
				}
			}

		}
	}

}
