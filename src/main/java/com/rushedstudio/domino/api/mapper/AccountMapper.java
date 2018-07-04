package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.dto.AccountDTO;
import com.rushedstudio.domino.api.model.list.AccountListDTO;
import com.rushedstudio.domino.domain.Account;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AccountMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    AccountDTO accountToAccountDTO(Account account);

    Account accountDTOToAccount(AccountDTO accountDTO);

    List<AccountDTO> accountListToAccountDTOList(List<Account> accounts);

    List<Account> accountDTOListToAccountList(List<AccountListDTO> accountListDTOS);
}
