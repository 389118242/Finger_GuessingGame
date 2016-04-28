package lanqiao;

import java.util.Scanner;

public class Judger {
	private int total = 0;// ��Ϸ����
	private Persion persion = new Persion();// ����
	private Computer computer = new Computer();// ����

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

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
		computer.inputName();
		persion.inputName();
		System.out.println(persion.getPlayerName() + " VS " + computer.getPlayerName() + " ��ս\n");
		System.out.print("Ҫ��ʼ�𣿣�y/n��");
		Scanner input = new Scanner(System.in);
		String select = input.next();
		if (select.equalsIgnoreCase("y")) {
			playGame();
		} else {
			System.out.println("��Ϸ����");
		}
	}

	/**
	 * ��ʼ��Ϸ
	 */
	public void playGame() {
		do {
			int persionFist = persion.myFist();
			int computerFist = computer.myFist();
			switch (persionFist) {
			case 1:
				System.out.println("���ȭ������");
				break;
			case 2:
				System.out.println("���ȭ��ʯͷ");
				break;
			case 3:
				System.out.println("���ȭ����");
				break;
			}
			System.out.print(computer.getPlayerName() + "��ȭ��");
			switch (computerFist) {
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("ʯͷ");
				break;
			case 3:
				System.out.println("��");
				break;
			}
			if (persionFist == computerFist) {
				System.out.println("�����ƽ��");
			} else if (persionFist-computerFist==1||persionFist-computerFist==-2) {
				System.out.println("�������ϲ����Ӯ��");
				persion.setWinningTimes(persion.getWinningTimes() + 1);
			} else {
				System.out.println("�����������������");
				computer.setWinningTimes(computer.getWinningTimes() + 1);
			}
			total++;
			System.out.print("\n�Ƿ�ʼ��һ�֣�y/n��:");
			Scanner input = new Scanner(System.in);
			String select = input.next();
			if (select.equalsIgnoreCase("N")) {
				break;
			}else if(select.equalsIgnoreCase("Y")){
				continue;
			}
		} while (true);
		finalResult();
	}

	/**
	 * ������Ϸ���
	 */
	public void finalResult() {
		System.out.println("------------------------------------");
		System.out.println("\t"+persion.getPlayerName()+" VS "+computer.getPlayerName());
		System.out.println("\t��ս������"+total);
		if(total>(persion.getWinningTimes()+computer.getWinningTimes())){
			System.out.println("\tƽ�ִ�����"+(total-(persion.getWinningTimes()+computer.getWinningTimes())));
		}
		System.out.println();
		System.out.println("����\t�÷�");
		System.out.println(persion.getPlayerName()+"\t"+persion.getWinningTimes());
		System.out.println(computer.getPlayerName()+"\t"+computer.getWinningTimes()+"\n");
		System.out.print("�����");
		if(persion.getWinningTimes()>computer.getWinningTimes()){
			System.out.println("��ϲ�㣬սʤ��"+computer.getPlayerName()+"��");
		}else if(persion.getWinningTimes()==computer.getWinningTimes()){
			System.out.println("���ź������"+computer.getPlayerName()+"ս��ƽ�֣�");
		}else{
			System.out.println("���ź���"+computer.getPlayerName()+"սʤ���㣡");
		}
				
	}

}
