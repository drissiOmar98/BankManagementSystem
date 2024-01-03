package drissi.omar.accountservice.service;


import drissi.omar.accountservice.clients.CustomerRestClient;
import drissi.omar.accountservice.entities.Account;
import drissi.omar.accountservice.model.Customer;
import drissi.omar.accountservice.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {


    private final AccountRepository accountRepository;

    private final CustomerRestClient customerRestClient;

    public void saveAccount(Account account) {
        accountRepository.save(account);
    }

    public List<Account> findAllAccounts() {
        return accountRepository.findAll();
    }

    public Account getAccountById(String accountId){
        Account account= accountRepository.findById(accountId).get();
        Customer customer= customerRestClient.findCustomerById(account.getCustomerId());
        account.setCustomer(customer);
        return account;
    }


}
