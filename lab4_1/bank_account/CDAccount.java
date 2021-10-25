package exercise.lab4_1.bank_account;
import java.util.Date;
/*
 * tạo class CDAccount kế thừ class BanksAccount 
 * 
 * thêm 2 thuộc tính : rate(lãi suât), maturityDate(kì bạn)
 */
public class CDAccount extends BankAccount {
	private double rate;
	private Date maturityDate;

	/*
	 * tạo contructor cho class SavingsAccount
	 */
	public CDAccount(int id, String name, double currentBalace, double rate, Date maturityDate) {
		super(id, name, currentBalace);
		this.rate = rate;
		this.maturityDate = maturityDate;
	}

}
