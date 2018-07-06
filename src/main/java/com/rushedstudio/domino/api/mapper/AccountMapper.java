package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.AccountDto;
import com.rushedstudio.domino.domain.Account;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AccountMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    AccountDto toAccountDTO(Account account);

    Account toAccount(AccountDto accountDto);

    List<AccountDto> toAccountDTOList(List<Account> accounts);

    List<Account> toAccountList(List<AccountDto> accountListDTOS);
}
