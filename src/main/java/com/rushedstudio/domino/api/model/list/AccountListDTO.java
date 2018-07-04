package com.rushedstudio.domino.api.model.list;

import com.rushedstudio.domino.api.model.dto.AccountDTO;
import lombok.Data;

import java.util.List;

@Data
public class AccountListDTO {

    private List<AccountDTO> accountDTOList;
}
