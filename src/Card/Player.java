package Card;

import java.util.Arrays;

public class Player {
	private int id;
	private String name;
	private Card[] cards = {};
	public Player(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public void add(Card card){
		cards = Arrays.copyOf(cards,cards.length+1);
		cards[cards.length-1] = card;
	}
	@Override
	public String toString(){
		return id+","+name+Arrays.toString(cards);
	}
	
}
