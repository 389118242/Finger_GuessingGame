package cn.edu.qdu.game;

import java.util.Scanner;

public class Persion extends Player {

	@Override
	public int myFist() {
		int result = 0;// 接收用户选择
		Scanner input = new Scanner(System.in);
		result = input.nextInt();
		while (result < 1 || result > 3) {
			System.out.print("输入错误，请重新输入（1-3）：");
			result = input.nextInt();
		}
		return result;
	}

	@Override
	public void inputName() {
		String result = new Scanner(System.in).next();
		setPlayerName(result);// 将用户姓名赋给playerName
	}
	
	public String inputIsContinue(){
		Scanner input = new Scanner(System.in);
		return input.next();
	}
}
