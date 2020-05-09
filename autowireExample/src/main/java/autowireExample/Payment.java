package autowireExample;

public class Payment {
	private UPIPayments upipayment;
	private WalletPayments walletpayments;
	public UPIPayments getUpipayment() {
		return upipayment;
	}
	public void setUpipayment(UPIPayments upipayment) {
		this.upipayment = upipayment;
	}
	public WalletPayments getWalletpayments() {
		return walletpayments;
	}
	public void setWalletpayments(WalletPayments walletpayments) {
		this.walletpayments = walletpayments;
	}
	@Override
	public String toString() {
		return "Payment [upipayment=" + upipayment + ", walletpayments=" + walletpayments + "]";
	}
	
}
