package autowireExample;

public class UPIPayments {
	private String personNameUPI;
	private int amount;
	public String getPersonNameUPI() {
		return personNameUPI;
	}
	public void setPersonNameUPI(String personNameUPI) {
		this.personNameUPI = personNameUPI;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "UPIPayments [personNameUPI=" + personNameUPI + ", amount=" + amount + "]";
	}
	

}
