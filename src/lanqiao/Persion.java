package lanqiao;

import java.util.Scanner;

public class Persion extends Player {

	@Override
	protected int myFist() {
		int result = 0;
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
		System.out.print("������������֣�");
		String result=new Scanner(System.in).next();
		setPlayerName(result);
	}

}
