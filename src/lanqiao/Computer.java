package lanqiao;

import java.util.Random;
import java.util.Scanner;

public class Computer extends Player {

	@Override
	public int myFist() {
		return new Random().nextInt(3)+1;//随机生成出拳结果
	}

	@Override
	public void inputName() {
		System.out.print("请选择对方角色（1：刘备 2：孙权 3:曹操）：");//提示用户选择对方角色
		String result=null;//用于接收选择结果
		switch (new Scanner(System.in).nextInt()) {
		case 1:
			result="刘备";
			break;
		case 2:
			result="孙权";
			break;
		case 3:
			result="曹操";
			break;
		}
		setPlayerName(result);//将选择结果赋给playerName
	}

}
