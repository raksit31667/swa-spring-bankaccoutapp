package sample.spring.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.spring.dao.BankAccountDao;
import sample.spring.domain.BankAccountDetails;

/**
 * 
 * @author raksit
 *
 */

@Service(value = "bankAccountService")
public class BankAccountServiceImpl implements BankAccountService {
	
	private Logger logger = Logger.getLogger(BankAccountServiceImpl.class);
	
	@Autowired
	private BankAccountDao bankAccountDao;

	@Override
	public int createBankAccount(BankAccountDetails bankAccountDetails) {
		logger.info(String.format("createBankAccount is invoked (BankAccountDetails = %s)", bankAccountDetails.toString()));
		return bankAccountDao.createBankAccount(bankAccountDetails);
	}
	
			
}
