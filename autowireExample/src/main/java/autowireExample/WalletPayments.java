package autowireExample;

public class WalletPayments {
	private String personNameWP;
	private int amount;
	public String getPersonNameWP() {
		return personNameWP;
	}
	public void setPersonNameWP(String personNameWP) {
		this.personNameWP = personNameWP;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "WalletPayments [personNameWP=" + personNameWP + ", amount=" + amount + "]";
	}

}
