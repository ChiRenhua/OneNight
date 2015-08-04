package com.example.onenight;

import java.util.ArrayList;
import java.util.HashMap;

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
public class CharactersFactory {
	private ArrayList<Characters> characters = new ArrayList<Characters>();// ��������Ѿ�ʵ�����õĽ�ɫ

	public ArrayList<Characters> getCharacters() {
		return characters;
	}

	/*
	 * ʵ������ɫ
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
