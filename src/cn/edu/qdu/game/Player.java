package cn.edu.qdu.game;

public abstract class Player {
	private String playerName;
	private int winningTimes=0;

	/**
	 * 获取出拳结果
	 * @return 出拳结果[剪刀、石头、布]
	 */
	protected abstract int myFist();
	
	/**
	 * 输入姓名
	 */
	protected abstract void inputName();
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getWinningTimes() {
		return winningTimes;
	}
	public void setWinningTimes(int winningTimes) {
		this.winningTimes = winningTimes;
	}
}
