package by.alina.banking.accountservice.service;

import by.alina.banking.accountservice.exeption.MyEntityNotFoundException;
import by.alina.banking.accountservice.model.Account;
import by.alina.banking.accountservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account getAccountById(Long id){
        return accountRepository.findById(id).orElseThrow(() -> new MyEntityNotFoundException(id));
    }

    public Account getAccountsByName(String name){
        return accountRepository.findByName(name);
    }

    public Account newAccount(Account account){
        return accountRepository.save(account);
    }

    public Account updateAccount(Long id, Account account){
        Account updateAccount = getAccountById(id);

        updateAccount.setName(account.getName());
        updateAccount.setStatus(account.getStatus());
        updateAccount.setType(account.getType());
        updateAccount.setBalance(account.getBalance());

        return accountRepository.save(updateAccount);
    }

    public Account updateCurrentAccount(String name, Account account){
        Account updateAccount = getAccountsByName(name);

        updateAccount.setName(account.getName());
        updateAccount.setStatus(account.getStatus());
        updateAccount.setType(account.getType());
        updateAccount.setBalance(account.getBalance());

        return accountRepository.save(updateAccount);
    }

    public void deleteAccount(Long id){
        accountRepository.deleteById(id);
    }
}
