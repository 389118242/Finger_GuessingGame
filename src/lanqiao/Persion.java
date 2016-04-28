package lanqiao;

import java.util.Scanner;

public class Persion extends Player {

	@Override
	public int myFist() {
		System.out.print("请出拳：1.剪刀  2.石头 3.布（输入相应数字）");//提示用户输入选择
		int result = 0;//接收用户选择
		Scanner input = new Scanner(System.in);
		result=input.nextInt();
		while(result<1||result>3){
			System.out.print("输入错误，请重新输入（1-3）：");
			result=input.nextInt();
		}
		return result;
	}

	@Override
	public void inputName() {
		System.out.print("请输入你的名字：");//提示用户输入姓名
		String result=new Scanner(System.in).next();
		setPlayerName(result);//将用户姓名赋给playerName
	}

}
