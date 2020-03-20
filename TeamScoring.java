package kimesh.GoodFellas;

public class TeamScoring {
	private int framesPlayed;
	private int matchesPlayed;
	private int matchesWon;
	private int matchesLost;
	private int lag;
	private int points = 3;
	private int bonus = 1; 
	private int forfeitsFor;
	private int forfeitsGiven;
	private int breakAndWashFor;
	private int breakAndWashAgainst;
	
	public TeamScoring() {
		
	}

	public int getFramesPlayed() {
		return framesPlayed;
	}

	public void setFramesPlayed(int framesPlayed) {
		this.framesPlayed = framesPlayed;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public int getMatchesWon() {
		return matchesWon;
	}

	public void setMatchesWon(int matchesWon) {
		this.matchesWon = matchesWon;
	}

	public int getMatchesLost() {
		return matchesLost;
	}

	public void setMatchesLost(int matchesLost) {
		this.matchesLost = matchesLost;
	}

	public int getLag() {
		return lag;
	}

	public void setLag(int lag) {
		this.lag = lag;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getForfeitsFor() {
		return forfeitsFor;
	}

	public void setForfeitsFor(int forfeitsFor) {
		this.forfeitsFor = forfeitsFor;
	}

	public int getForfeitsGiven() {
		return forfeitsGiven;
	}

	public void setForfeitsGiven(int forfeitsGiven) {
		this.forfeitsGiven = forfeitsGiven;
	}

	public int getBreakAndWashFor() {
		return breakAndWashFor;
	}

	public void setBreakAndWashFor(int breakAndWashFor) {
		this.breakAndWashFor = breakAndWashFor;
	}

	public int getBreakAndWashAgainst() {
		return breakAndWashAgainst;
	}

	public void setBreakAndWashAgainst(int breakAndWashAgainst) {
		this.breakAndWashAgainst = breakAndWashAgainst;
	}
	
	
	

}
