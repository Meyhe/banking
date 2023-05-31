package by.alina.banking.accountservice.controller;

import by.alina.banking.accountservice.dto.AccountDTO;
import by.alina.banking.accountservice.mapper.AccountMapper;
import by.alina.banking.accountservice.model.Account;
import by.alina.banking.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;
    private final AccountMapper accountMapper;

    @Autowired
    public AccountController(AccountService accountService, AccountMapper accountMapper) {
        this.accountService = accountService;
        this.accountMapper = accountMapper;
    }

    @GetMapping("/{name}")
    @ResponseStatus(HttpStatus.OK)
    public AccountDTO getAccountByName(@PathVariable String name){
        return accountMapper.accountToAccountDTO(accountService.getAccountsByName(name));
    }

    @GetMapping("/current")
    @ResponseStatus(HttpStatus.OK)
    public AccountDTO getCurrentAccount(Principal principal){
        return accountMapper.accountToAccountDTO(accountService.getAccountsByName(principal.getName()));
    }

    @PutMapping("/current")
    @ResponseStatus(HttpStatus.OK)
    public AccountDTO updateAccount(Principal principal, @RequestBody Account account){
        return accountMapper.accountToAccountDTO(accountService.updateCurrentAccount(principal.getName(), account));
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public AccountDTO newAccount(@RequestBody Account account){
        return accountMapper.accountToAccountDTO(accountService.newAccount(account));
    }
}
