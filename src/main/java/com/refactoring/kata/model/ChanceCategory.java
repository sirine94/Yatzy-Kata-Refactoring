package com.refactoring.kata.model;

public class ChanceCategory implements Category {

	@Override
	public int getScore(DiceRoll diceRoll) {
		return diceRoll.sum();
	}
}