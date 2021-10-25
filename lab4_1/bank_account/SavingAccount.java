package exercise.lab4_1.bank_account;

public class SavingAccount extends BankAccount {
	/*
	 * tạo lớp SavingAccount kết thừa từ class BankAccount
	 * 
	 * thêm thuộc tính rate(lãi suất);
	 */
	private double rate;

	public SavingAccount(int id, String name, double currentBalace, double rate) {
		super(id, name, currentBalace);
		this.rate = rate;
	}

}
