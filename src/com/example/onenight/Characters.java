package com.example.onenight;

import java.util.ArrayList;

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
public abstract class Characters {
	private Card card;

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	abstract void Skill(ArrayList<Card> cards);
}

class Werewolf/* 狼人 */extends Characters {

	@Override
	void Skill(ArrayList<Card> cards) {
		// TODO Auto-generated method stub

	}

}

class Seer/* 预言家 */extends Characters {

	@Override
	void Skill(ArrayList<Card> cards) {
		// TODO Auto-generated method stub

	}

}

class Troublemaker/* 捣蛋鬼 */extends Characters {

	@Override
	void Skill(ArrayList<Card> cards) {
		// TODO Auto-generated method stub

	}

}

class Robber/* 强盗 */extends Characters {

	@Override
	void Skill(ArrayList<Card> cards) {
		// TODO Auto-generated method stub

	}

}

class Lackeys/* 爪牙 */extends Characters {

	@Override
	void Skill(ArrayList<Card> cards) {
		// TODO Auto-generated method stub

	}

}

class Insomniac/* 失眠者 */extends Characters {

	@Override
	void Skill(ArrayList<Card> cards) {
		// TODO Auto-generated method stub

	}

}

class Drunk/* 酒鬼 */extends Characters {

	@Override
	void Skill(ArrayList<Card> cards) {
		// TODO Auto-generated method stub

	}

}

class Hunter/* 猎人 */extends Characters {

	@Override
	void Skill(ArrayList<Card> cards) {
		// TODO Auto-generated method stub

	}

}

class Cobbler/* 皮匠 */extends Characters {

	@Override
	void Skill(ArrayList<Card> cards) {
		// TODO Auto-generated method stub

	}

}

class Card {

}
