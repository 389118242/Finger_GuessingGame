package lanqiao;

import java.util.Random;
import java.util.Scanner;

public class Computer extends Player {

	@Override
	public int myFist() {
		return new Random().nextInt(3)+1;//������ɳ�ȭ���
	}

	@Override
	public void inputName() {
		System.out.print("��ѡ��Է���ɫ��1������ 2����Ȩ 3:�ܲ٣���");//��ʾ�û�ѡ��Է���ɫ
		String result=null;//���ڽ���ѡ����
		switch (new Scanner(System.in).nextInt()) {
		case 1:
			result="����";
			break;
		case 2:
			result="��Ȩ";
			break;
		case 3:
			result="�ܲ�";
			break;
		}
		setPlayerName(result);//��ѡ��������playerName
	}

}
