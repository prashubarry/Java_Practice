package com.practice.java;
import java.util.*;
class Card{
	public static enum Face{Ace,Deuce,Three,Four,Five,Six,Seven,Eight,Nine,Ten,Jack,Queen,King};
	public static enum Suit{Clubs,Diamonds,Hearts,Spades};
	
	private final Face face;
	private final Suit suit;
	
	//Constructor for Card class
	public Card(Face face, Suit suit) {
		this.face=face;
		this.suit=suit;
	}
	//return the face of the card
	public Face getFace() {
		return face;
	}
	//return the suit of the card
	public Suit getSuit() {
		return suit;
	}
	//return string representation of card
	public String toString() {
		return String.format("%s of %s",face,suit);
	}	
}
public class DeckOfCards {
	private List<Card> list;
	public DeckOfCards() {
		Card [] deck = new Card[52];
		int count =0;
		//populate deck with card objects
		for(Card.Suit suit: Card.Suit.values()) {
			for(Card.Face face: Card.Face.values()) {
				deck[count]=new Card (face,suit);
				count++;
			}
		}
		//Covert the above array to a list
		list = Arrays.asList(deck);
		Collections.shuffle(list);
		}
	//output the deck as 13 rows and 4 columns
	public void printCards() {
		for(int i = 0; i<list.size();i++) {
			System.out.printf("%-19s%s",list.get(i),((i+1)%4)==0 ? System.lineSeparator():"");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Card shuffling and dealing with collections method shuffle
		DeckOfCards cards = new DeckOfCards();
		cards.printCards();
	}
}
