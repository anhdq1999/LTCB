package exercise.lab4_1.bank_account;
/*
 * taọ abstract class chứa các thuộc tính
 * 
 *  id, name, currentBalace
 */
public abstract class BankAccount {
	protected int id;
	protected String name;
	protected double currentBalace;
	
	/*
	 * Tao contructor cho abstract class BankAccount
	 */
	public BankAccount(int id, String name, double currentBalace) {
		super();
		this.id = id;
		this.name = name;
		this.currentBalace = currentBalace;
	}
	
}


