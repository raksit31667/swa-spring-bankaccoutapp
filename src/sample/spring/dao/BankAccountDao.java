package sample.spring.dao;

import sample.spring.domain.BankAccountDetails;

/**
 * 
 * @author raksit
 *
 */

public interface BankAccountDao {
	int createBankAccount(BankAccountDetails bankAccountDetails);
	void subtractFromAccount(int bankAccountId, int amount);
}
