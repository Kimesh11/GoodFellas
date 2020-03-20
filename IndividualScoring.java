package kimesh.GoodFellas;

public class IndividualScoring {
	private int framesPlayed;
	private int matchesPlayed;
	private int matchesWon;
	private int matchesLost;
	private int lag;
	private int points;
	//private int bonus; // Only applies to teams.
	private int forfeitsFor;
	private int forfeitsGiven;
	private int breakAndWashFor;
	private int breakAndWashAgainst;
	// TODO add frame difference;
	
	public IndividualScoring(){
		
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

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	public enum IndividualStats {
		/* Values:
		 * A = Break and finish
		 * B = won lag and game
		 * C = Won game and lost lag
		 * D = Won lag and lost game
		 * E = Lost lag and game 
		 * Z = Break and finish given to player
		 * 
		 * Forfeits:
		 * F = Forfeits for
		 * G = Forfeits given */

		A, B, C, D, E, F, G, Z;
		
		/* Scoring done as follows:
		 * A = Z
		 * B = E
		 * C = D
		 * F = G */
	}
	
	public void playerScoring(IndividualStats indStats) {
		String msg = null;
		
		switch(indStats) {
			case A: framesPlayed++;
					matchesPlayed++;
					matchesWon++;
					breakAndWashFor++;
					lag++;
					points++;
				break;
			
			case B: framesPlayed++;
					matchesPlayed++;
					matchesWon++;
					lag++;
					points++;
				break;
			
			case C: framesPlayed++;
					matchesPlayed++;
					matchesWon++;
					points++;
				break;
			
			case D: framesPlayed++;
					matchesPlayed++;
					matchesLost++;
					lag++;
				break;	
			
			case E: framesPlayed++;
					matchesPlayed++;
					matchesLost++;
				break;
				
			case F: framesPlayed++;
					forfeitsFor++;
					points++;
				break;
				
			case G: framesPlayed++;
					forfeitsGiven++;
				break;
				
			case Z: framesPlayed++;
					breakAndWashAgainst++;
				break;
				
			default: msg = "Character doesn't match! "
					+ "Accepted characters: A, B, C, D, E, F, G, Z.";
		}
	}
	
	public boolean playerHeadToHead(IndividualStats indStats) {
		if(indStats == IndividualStats.A) {
			indStats = IndividualStats.Z;
			return true;
		}
		if(indStats == IndividualStats.B) {
			indStats = IndividualStats.E;
			return true;
		}
		if(indStats == IndividualStats.C) {
			indStats = IndividualStats.D;
			return true;
		}
		if(indStats == IndividualStats.D) {
			indStats = IndividualStats.C;
			return true;
		}
		if(indStats == IndividualStats.E) {
			indStats = IndividualStats.B;
			return true;
		}
		if(indStats == IndividualStats.Z) {
			indStats = IndividualStats.A;
			return true;
		}
		if(indStats == IndividualStats.F) {
			indStats = IndividualStats.G;
			return true;
		}
		if(indStats == IndividualStats.G) {
			indStats = IndividualStats.F;
			return true;
		}
		return false;
	}
}
