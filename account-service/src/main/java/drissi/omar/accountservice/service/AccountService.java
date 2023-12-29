package drissi.omar.accountservice.service;


import drissi.omar.accountservice.entities.Account;
import drissi.omar.accountservice.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {


    private final AccountRepository accountRepository;

    public void saveAccount(Account account) {
        accountRepository.save(account);
    }

    public List<Account> findAllAccounts() {
        return accountRepository.findAll();
    }

    public Account getAccountById(String accountId){
        return accountRepository.findById(accountId).get();
    }


}
