package cn.edu.qdu.game;

import java.util.Scanner;

public class Judger {
	private int total = 0;// ��Ϸ����
	private Persion persion = new Persion();// ����
	private Computer computer = new Computer();// ����

	/**
	 * ��ʾ��Ϸ��ʼ����Ϸ����
	 */
	public void startGame() {
		System.out.println("\t******************");
		System.out.println("\t***   ��ȭ��Ϸ   ***");
		System.out.println("\t******************\n");
		System.out.println("��ȭ����1.���� 2.ʯͷ 3.��");
	}

	/**
	 * ��ȡ˫��name
	 */
	public void askName() {
		System.out.print("��ѡ��Է���ɫ��1������ 2����Ȩ 3:�ܲ٣���");// ��ʾ�û�ѡ��Է���ɫ
		computer.inputName();
		System.out.print("������������֣�");// ��ʾ�û���������
		persion.inputName();
		System.out.println(persion.getPlayerName() + " VS " + computer.getPlayerName() + " ��ս\n");
	}

	/**
	 * ��ʼ��Ϸ
	 */
	public void playGame() {
		do {
			String[] fist = { "����", "ʯͷ", "��" };
			System.out.print("�� "+persion.getPlayerName()+" ��ȭ��1.����  2.ʯͷ 3.����������Ӧ���֣�:");// ��ʾ�û�����ѡ��
			int persionFist = persion.myFist();
			int computerFist = computer.myFist();
			System.out.println(persion.getPlayerName() + " ��ȭ��" + fist[persionFist - 1]);
			System.out.println(computer.getPlayerName() + " ��ȭ��" + fist[computerFist - 1]+"\n");
			if (persionFist == computerFist) {
				System.out.println("�����ƽ��");
			} else if (persionFist - computerFist == 1 || persionFist - computerFist == -2) {
				System.out.println("�������ϲ����Ӯ��");
				persion.setWinningTimes(persion.getWinningTimes() + 1);
			} else {
				System.out.println("�����������������");
				computer.setWinningTimes(computer.getWinningTimes() + 1);
			}
			total++;
			System.out.print("\n�Ƿ�ʼ��һ�֣�y/n��:");
			String select = persion.inputIsContinue();
			if (select.equalsIgnoreCase("N")) {
				break;
			} else if (select.equalsIgnoreCase("Y")) {
				continue;
			}
		} while (true);
	}

	/**
	 * ������Ϸ���
	 */
	public void finalResult() {
		System.out.println("------------------------------------");
		System.out.println("\t" + persion.getPlayerName() + " VS " + computer.getPlayerName());
		System.out.println("\t��ս������" + total);
		if (total > (persion.getWinningTimes() + computer.getWinningTimes())) {
			System.out.println("\tƽ�ִ�����" + (total - (persion.getWinningTimes() + computer.getWinningTimes())));
		}
		System.out.println();
		System.out.println("����\t�÷�");
		System.out.println(persion.getPlayerName() + "\t" + persion.getWinningTimes());
		System.out.println(computer.getPlayerName() + "\t" + computer.getWinningTimes() + "\n");
		System.out.print("�����");
		if (persion.getWinningTimes() > computer.getWinningTimes()) {
			System.out.println("��ϲ�㣬սʤ��" + computer.getPlayerName() + "��");
		} else if (persion.getWinningTimes() == computer.getWinningTimes()) {
			System.out.println("���ź������" + computer.getPlayerName() + "ս��ƽ�֣�");
		} else {
			System.out.println("���ź���" + computer.getPlayerName() + "սʤ���㣡");
		}

	}

}
