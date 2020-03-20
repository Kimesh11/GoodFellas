package kimesh.GoodFellas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Players {
	
	private List<Player> players = new ArrayList<Player>();
	private Player player;

	public Players() {
	
	}

	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public void removePlayer(Player player) {
		players.remove(player);
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public List<Player> listPlayers() {
		return players;
		
	}
	
	public List<Player> searchPlayerByName(String name) {
		List<Player> tempList = new ArrayList<>();
		if(players != null && players.size() > 0) {
			for(int i = 0; i < players.size(); i++)
			{
				if(name.equalsIgnoreCase(players.get(i).getName())) {
					tempList.add(player);
				}
			}
			return tempList;
		}
		return null;
	}
	
	
	public List<Player> searchPlayerBySurname(String surname) {
	
		List<Player> tempList = new ArrayList<>();
		if(players != null && players.size() > 0) {
			for(int i = 0; i < players.size(); i++) { 
				if(surname.equalsIgnoreCase(players.get(i).getSurname())) { 
					tempList.add(players.get(i));
				} 
			}
			return tempList;
		}
		return null;		 
	}
	
	@Override
	public String toString() {
		return "Players: " + players;
	}

	public static void main(String[] args) {
		Player p1 = new Player("man001","Chetan", "Mangla");
		Player p2 = new Player("nag001","Kimesh", "Nagiah");
		Player p3 = new Player("nag002","Kieran", "Nagiah");
		Player p4 = new Player("gov001","Brenan", "Govender");
		
		Players players = new Players();
		
		players.addPlayer(p1);
		players.addPlayer(p2);
		players.addPlayer(p3);
		players.addPlayer(p4);
		
		List<Player> playerSearchedFor = players.listPlayers();
		System.out.println(playerSearchedFor.toString());
		
	}

	
	
	
	
}
