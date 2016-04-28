package cn.edu.qdu.game;

import java.util.Scanner;

public class Judger {
	private int total = 0;// 游戏次数
	private Persion persion = new Persion();// 人物
	private Computer computer = new Computer();// 电脑

	/**
	 * 显示游戏开始和游戏规则
	 */
	public void startGame() {
		System.out.println("\t******************");
		System.out.println("\t***   猜拳游戏   ***");
		System.out.println("\t******************\n");
		System.out.println("出拳规则：1.剪刀 2.石头 3.布");
	}

	/**
	 * 获取双方name
	 */
	public void askName() {
		System.out.print("请选择对方角色（1：刘备 2：孙权 3:曹操）：");// 提示用户选择对方角色
		computer.inputName();
		System.out.print("请输入你的名字：");// 提示用户输入姓名
		persion.inputName();
		System.out.println(persion.getPlayerName() + " VS " + computer.getPlayerName() + " 对战\n");
	}

	/**
	 * 开始游戏
	 */
	public void playGame() {
		do {
			String[] fist = { "剪刀", "石头", "布" };
			System.out.print("请 "+persion.getPlayerName()+" 出拳：1.剪刀  2.石头 3.布（输入相应数字）:");// 提示用户输入选择
			int persionFist = persion.myFist();
			int computerFist = computer.myFist();
			System.out.println(persion.getPlayerName() + " 出拳：" + fist[persionFist - 1]);
			System.out.println(computer.getPlayerName() + " 出拳：" + fist[computerFist - 1]+"\n");
			if (persionFist == computerFist) {
				System.out.println("结果：平局");
			} else if (persionFist - computerFist == 1 || persionFist - computerFist == -2) {
				System.out.println("结果：恭喜，你赢了");
				persion.setWinningTimes(persion.getWinningTimes() + 1);
			} else {
				System.out.println("结果：笨蛋，你输了");
				computer.setWinningTimes(computer.getWinningTimes() + 1);
			}
			total++;
			System.out.print("\n是否开始下一轮（y/n）:");
			String select = persion.inputIsContinue();
			if (select.equalsIgnoreCase("N")) {
				break;
			} else if (select.equalsIgnoreCase("Y")) {
				continue;
			}
		} while (true);
	}

	/**
	 * 宣布游戏结果
	 */
	public void finalResult() {
		System.out.println("------------------------------------");
		System.out.println("\t" + persion.getPlayerName() + " VS " + computer.getPlayerName());
		System.out.println("\t对战次数：" + total);
		if (total > (persion.getWinningTimes() + computer.getWinningTimes())) {
			System.out.println("\t平局次数：" + (total - (persion.getWinningTimes() + computer.getWinningTimes())));
		}
		System.out.println();
		System.out.println("姓名\t得分");
		System.out.println(persion.getPlayerName() + "\t" + persion.getWinningTimes());
		System.out.println(computer.getPlayerName() + "\t" + computer.getWinningTimes() + "\n");
		System.out.print("结果：");
		if (persion.getWinningTimes() > computer.getWinningTimes()) {
			System.out.println("恭喜你，战胜了" + computer.getPlayerName() + "！");
		} else if (persion.getWinningTimes() == computer.getWinningTimes()) {
			System.out.println("很遗憾，你和" + computer.getPlayerName() + "战成平手！");
		} else {
			System.out.println("很遗憾，" + computer.getPlayerName() + "战胜了你！");
		}

	}

}
