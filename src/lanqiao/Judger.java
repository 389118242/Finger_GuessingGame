package lanqiao;

import java.util.Scanner;

public class Judger {
	private int total = 0;// 游戏次数
	private Persion persion = new Persion();// 人物
	private Computer computer = new Computer();// 电脑

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

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
		computer.inputName();
		persion.inputName();
		System.out.println(persion.getPlayerName() + " VS " + computer.getPlayerName() + " 对战\n");
		System.out.print("要开始吗？（y/n）");
		Scanner input = new Scanner(System.in);
		String select = input.next();
		if (select.equalsIgnoreCase("y")) {
			playGame();
		} else {
			System.out.println("游戏结束");
		}
	}

	/**
	 * 开始游戏
	 */
	public void playGame() {
		do {
			int persionFist = persion.myFist();
			int computerFist = computer.myFist();
			switch (persionFist) {
			case 1:
				System.out.println("你出拳：剪刀");
				break;
			case 2:
				System.out.println("你出拳：石头");
				break;
			case 3:
				System.out.println("你出拳：布");
				break;
			}
			System.out.print(computer.getPlayerName() + "出拳：");
			switch (computerFist) {
			case 1:
				System.out.println("剪刀");
				break;
			case 2:
				System.out.println("石头");
				break;
			case 3:
				System.out.println("布");
				break;
			}
			if (persionFist == computerFist) {
				System.out.println("结果：平局");
			} else if (persionFist-computerFist==1||persionFist-computerFist==-2) {
				System.out.println("结果：恭喜，你赢了");
				persion.setWinningTimes(persion.getWinningTimes() + 1);
			} else {
				System.out.println("结果：笨蛋，你输了");
				computer.setWinningTimes(computer.getWinningTimes() + 1);
			}
			total++;
			System.out.print("\n是否开始下一轮（y/n）:");
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
	 * 宣布游戏结果
	 */
	public void finalResult() {
		System.out.println("------------------------------------");
		System.out.println("\t"+persion.getPlayerName()+" VS "+computer.getPlayerName());
		System.out.println("\t对战次数："+total);
		if(total>(persion.getWinningTimes()+computer.getWinningTimes())){
			System.out.println("\t平局次数："+(total-(persion.getWinningTimes()+computer.getWinningTimes())));
		}
		System.out.println();
		System.out.println("姓名\t得分");
		System.out.println(persion.getPlayerName()+"\t"+persion.getWinningTimes());
		System.out.println(computer.getPlayerName()+"\t"+computer.getWinningTimes()+"\n");
		System.out.print("结果：");
		if(persion.getWinningTimes()>computer.getWinningTimes()){
			System.out.println("恭喜你，战胜了"+computer.getPlayerName()+"！");
		}else if(persion.getWinningTimes()==computer.getWinningTimes()){
			System.out.println("很遗憾，你和"+computer.getPlayerName()+"战成平手！");
		}else{
			System.out.println("很遗憾，"+computer.getPlayerName()+"战胜了你！");
		}
				
	}

}
