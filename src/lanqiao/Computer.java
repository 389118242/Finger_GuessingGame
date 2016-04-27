package lanqiao;

import java.util.Random;
import java.util.Scanner;

public class Computer extends Player {

	@Override
	protected int myFist() {
		return new Random().nextInt(3)+1;
	}

	@Override
	public void inputName() {
		System.out.print("请选择对方角色（1：刘备 2：孙权 3:曹操）：");
		String result=null;
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
		setPlayerName(result);
	}

}
