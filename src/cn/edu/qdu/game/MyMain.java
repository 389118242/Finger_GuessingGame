package cn.edu.qdu.game;

public class MyMain {

	public static void main(String[] args) {
		Judger judger = new Judger();
		judger.startGame();
		judger.askName();
		judger.playGame();
		judger.finalResult();
	}

}
