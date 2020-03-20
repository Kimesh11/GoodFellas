package kimesh.GoodFellas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Team {
	private String teamID;
	private Player [] player;
	private String teamName;
	private List<Team> teamList = new ArrayList<Team>();
	
	public Team(String teamName) {
		this.teamName = teamName;
	}
	
	public Team(String teamID, String teamName, Player ... player) {
		this.teamName = teamName;
		this.player = player;
	}
	
	public void addTeam(Team team) {
		teamList.add(team);
	}
	
	public void removeTeam(Team team) {
		teamList.remove(team);
	}
	
	public List<Team> listTeams() {
		return teamList;
	}
	
	
	public String getTeamID() {
		return teamID;
	}

	public void setTeamID(String teamID) {
		this.teamID = teamID;
	}

	public Player[] getPlayer() {
		return player;
	}

	public void setPlayer(Player [] player) {
		this.player = player;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Team [teamID=" + teamID + ", player=" + Arrays.toString(player) + ", teamName=" + teamName
				+ ", teamList=" + teamList + "]";
	}
	
}
