package lanqiao;

import java.util.Scanner;

public class Persion extends Player {

	@Override
	public int myFist() {
		System.out.print("���ȭ��1.����  2.ʯͷ 3.����������Ӧ���֣�");//��ʾ�û�����ѡ��
		int result = 0;//�����û�ѡ��
		Scanner input = new Scanner(System.in);
		result=input.nextInt();
		while(result<1||result>3){
			System.out.print("����������������루1-3����");
			result=input.nextInt();
		}
		return result;
	}

	@Override
	public void inputName() {
		System.out.print("������������֣�");//��ʾ�û���������
		String result=new Scanner(System.in).next();
		setPlayerName(result);//���û���������playerName
	}

}
