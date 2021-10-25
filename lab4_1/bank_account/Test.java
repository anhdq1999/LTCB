package exercise.lab4_1.bank_account;

import java.util.Date;

import junit.framework.TestCase;

public class Test extends TestCase {

	/*
	 * SavingAccount(int id, String name, double currentBalace, double rate)
	 * 
	 * CDAccount(int id, String name, double currentBalace, double rate, Date
	 * maturityDate)
	 */
	public void testContructor() {
		CheckingAccount c = new CheckingAccount(1729, "Earl Gray", 1.250, 500);
		
		SavingAccount s = new SavingAccount(4104, "Ima Flatt", 10.123, 3.5);

		Date date = new Date(2005, 06, 01);
		CDAccount cd = new CDAccount(2992, "Annie Proulx", 800, 3.5, date);
	}
}
