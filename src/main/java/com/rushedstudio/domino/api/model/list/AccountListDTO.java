package com.rushedstudio.domino.api.model.list;

import com.rushedstudio.domino.api.model.dto.AccountDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class AccountListDTO {

    private List<AccountDTO> accountDTOList;
}
