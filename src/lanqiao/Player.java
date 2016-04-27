package lanqiao;

public abstract class Player {
	private String playerName;
	private int winningTimes=0;

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
	
	protected abstract int myFist();
	
	protected abstract void inputName();
}
