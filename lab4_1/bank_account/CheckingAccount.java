package exercise.lab4_1.bank_account;
/*
 * tạo lớp CheckingAccount kết thừa từ class BankAccount
 * 
 * thêm thuộc tính minimunsBalance(số dư tối thiểu);
 */
public class CheckingAccount extends BankAccount {
	private double minimunsBalance;

	public CheckingAccount(int id, String name, double currentBalace, double minimunsBalance) {
		super(id, name, currentBalace);
		this.minimunsBalance = minimunsBalance;
	}

}
