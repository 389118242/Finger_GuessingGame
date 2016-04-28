package cn.edu.qdu.game;

import java.util.Random;
import java.util.Scanner;

public class Computer extends Player {

	@Override
	public int myFist() {
		return new Random().nextInt(3) + 1;// 随机生成出拳结果
	}

	@Override
	public void inputName() {
		String[] name={"刘备","孙权","曹操"};
		Scanner input=new Scanner(System.in);
		setPlayerName(name[input.nextInt()]);// 将选择结果赋给playerName
	}

}
