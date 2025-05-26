package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		double tax = 0.0;
		if (getAnualIncome() >= 20000.00) {
			tax = getAnualIncome() * 0.25;
		} else {
			tax = getAnualIncome() * 0.15;
		}

		tax -= healthExpenditures * 0.5;
		
		if (tax < 0.0)
			tax = 0.0;
		
		return tax;
	}

}
