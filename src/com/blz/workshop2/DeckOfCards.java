package com.blz.workshop2;

import java.util.ArrayList;
import java.util.Scanner;

public class DeckOfCards {
	public static final Scanner scanner = new Scanner(System.in);
	public ArrayList<String> cardsDeck = new ArrayList<String>();

	// Welcome message
	public void welcome() {
		System.out.println("Welcome to the gaming world of Deck of Cards");
	}

	/**
	 * @Purpose :To shuffle Cards and display accordingly in consecutive sequence
	 * @Param :suits , ranks, no of cards
	 * @Function :For loop to get cards
	 * @Return :Int string
	 */
	public void deckOfCards() {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace" };
		int numOfCards = suits.length * ranks.length;
		System.out.println("\nNumber of cards in the deck is : " + numOfCards);
		// First we have to itterate for loop for ranks starting from index 0.
		for (int i = 0; i < ranks.length; i++) {
			// Now we have to ittreate the suits for all the indexes of ranks
			for (int j = 0; j < suits.length; j++) {
				cardsDeck.add(ranks[i] + "----->" + suits[j]);
			}
		}
		toDisplay(cardsDeck);
	}

	/*
	 * @Purpose :To shuffle Cards and display accordingly in consecutive sequence
	 * 
	 * @Param :suits , ranks, no of cards
	 */
	public static void toDisplay(ArrayList<String> cardsDeck) {
		System.out.println("\nCards in Deck:");
		for (String element : cardsDeck) {
			System.out.println(element);
		}
		System.out.println();
	}

	// Main class
	public static void main(String[] args) {
		DeckOfCards deckOfCardsGame = new DeckOfCards();
		deckOfCardsGame.welcome();
		deckOfCardsGame.deckOfCards();
	}
}