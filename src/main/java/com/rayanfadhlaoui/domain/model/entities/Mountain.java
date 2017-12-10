package com.rayanfadhlaoui.domain.model.entities;

public class Mountain implements Field {
	
	@Override
	public int getNumberOfTreasures() {
		return 0;
	}

	/**
	 * Mountain can not be reached, so it's impossible to add any treasure on that
	 * kind of field
	 * 
	 * @param numberOfTreasures
	 *            Number of treasures
	 * @return returns it self
	 */
	@Override
	public Field addTreasure(Integer numberOfTreasures) {
		return this;
	}

	@Override
	public boolean isAccessible() {
		return false;
	}

	@Override
	public int collectTreasure() {
		return 0;
	}

	@Override
	public void addAdventurer() {
		//do nothing
	}

	@Override
	public void removeAdventurer() {
		//do nothing
	}
}
