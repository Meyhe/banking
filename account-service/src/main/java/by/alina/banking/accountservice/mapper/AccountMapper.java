package by.alina.banking.accountservice.mapper;

import by.alina.banking.accountservice.dto.AccountDTO;
import by.alina.banking.accountservice.model.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);
    AccountDTO accountToAccountDTO (Account account);

}
