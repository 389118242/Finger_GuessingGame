package cn.edu.qdu.game;

import java.util.Scanner;

public class Persion extends Player {

	@Override
	public int myFist() {
		int result = 0;// �����û�ѡ��
		Scanner input = new Scanner(System.in);
		result = input.nextInt();
		while (result < 1 || result > 3) {
			System.out.print("����������������루1-3����");
			result = input.nextInt();
		}
		return result;
	}

	@Override
	public void inputName() {
		String result = new Scanner(System.in).next();
		setPlayerName(result);// ���û���������playerName
	}
	
	public String inputIsContinue(){
		Scanner input = new Scanner(System.in);
		return input.next();
	}
}
