package cn.edu.qdu.game;

import java.util.Random;
import java.util.Scanner;

public class Computer extends Player {

	@Override
	public int myFist() {
		return new Random().nextInt(3) + 1;// ������ɳ�ȭ���
	}

	@Override
	public void inputName() {
		String[] name={"����","��Ȩ","�ܲ�"};
		Scanner input=new Scanner(System.in);
		setPlayerName(name[input.nextInt()]);// ��ѡ��������playerName
	}

}
