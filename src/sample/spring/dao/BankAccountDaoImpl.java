package sample.spring.dao;

import org.springframework.stereotype.Repository;
import org.apache.log4j.Logger;
import sample.spring.domain.BankAccountDetails;

/**
 * 
 * @author raksit
 *
 */

@Repository(value = "bankAccountDao")
public class BankAccountDaoImpl implements BankAccountDao {
	
	private Logger logger = Logger.getLogger(BankAccountDaoImpl.class);

	@Override
	public int createBankAccount(BankAccountDetails bankAccountDetails) {
		//--create account and return it's primary key.
		logger.info(String.format("createBankAccount is invoked (BankAccountDetails = %s)", bankAccountDetails.toString()));
		return 1;
	}

	@Override
	public void subtractFromAccount(int bankAccountId, int amount) {
		logger.info(String.format("subtractFromAccount is invoked (bankAccountId = %d, amount = %d)", bankAccountId, amount));
		//-- subtract fixed deposit amount from bank account
		
	}
	
}
