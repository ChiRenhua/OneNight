package com.example.onenight;

import java.util.ArrayList;

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

class Werewolf/* ���� */extends Characters {

	@Override
	void Skill(ArrayList<Card> cards) {
		// TODO Auto-generated method stub

	}

}

class Seer/* Ԥ�Լ� */extends Characters {

	@Override
	void Skill(ArrayList<Card> cards) {
		// TODO Auto-generated method stub

	}

}

class Troublemaker/* ������ */extends Characters {

	@Override
	void Skill(ArrayList<Card> cards) {
		// TODO Auto-generated method stub

	}

}

class Robber/* ǿ�� */extends Characters {

	@Override
	void Skill(ArrayList<Card> cards) {
		// TODO Auto-generated method stub

	}

}

class Lackeys/* צ�� */extends Characters {

	@Override
	void Skill(ArrayList<Card> cards) {
		// TODO Auto-generated method stub

	}

}

class Insomniac/* ʧ���� */extends Characters {

	@Override
	void Skill(ArrayList<Card> cards) {
		// TODO Auto-generated method stub

	}

}

class Drunk/* �ƹ� */extends Characters {

	@Override
	void Skill(ArrayList<Card> cards) {
		// TODO Auto-generated method stub

	}

}

class Hunter/* ���� */extends Characters {

	@Override
	void Skill(ArrayList<Card> cards) {
		// TODO Auto-generated method stub

	}

}

class Cobbler/* Ƥ�� */extends Characters {

	@Override
	void Skill(ArrayList<Card> cards) {
		// TODO Auto-generated method stub

	}

}

class Card {

}
