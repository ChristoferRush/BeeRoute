package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.dto.AccountDTO;
import com.rushedstudio.domino.domain.Account;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {
        UserMapper.class,
        RoleMapper.class,
//        AccountMapper.class,
        AddressMapper.class,
        CityMapper.class,
        CountryMapper.class,
        LocationMapper.class,
        StateMapper.class,
        UserAddressMapper.class
})
public interface AccountMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    AccountDTO toAccountDTO(Account account);

    Account toAccount(AccountDTO accountDTO);

    List<AccountDTO> toAccountDTOList(List<Account> accounts);

    List<Account> toAccountList(List<AccountDTO> accountListDTOS);
}
