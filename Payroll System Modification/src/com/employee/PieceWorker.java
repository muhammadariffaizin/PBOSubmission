package com.employee;

public class PieceWorker extends Employee {
	private double wage;
	private int pieces;

	public PieceWorker(String firstName, String lastName,
			String socialSecurityNumber, double wage, int pieces) {
		super(firstName, lastName, socialSecurityNumber);
		this.setWage(wage);
		this.setPieces(pieces);
	}

	public double getWage() {
		return this.wage;
	}

	public void setWage(double wage) {
		if(wage < 0.0)
			throw new IllegalArgumentException("Wage must be >= 0.0"); 
		this.wage = wage;
	}

	public int getPieces() {
		return this.pieces;
	}

	public void setPieces(int pieces) {
		if(pieces < 0.0)
			throw new IllegalArgumentException("Number of pieces must be >= 0.0"); 
		this.pieces = pieces;
	}

	public double earnings() {
		return this.getWage() * this.getPieces();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s%s: %d%n%s: %.2f%n%s: %.2f%n", 
				"piece worker", super.toString(), 
				"number of pieces produced", this.getPieces(), 
				"wage per pieces", this.getWage(),
				"earnings", this.earnings());
	}
}
