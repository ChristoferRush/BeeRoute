package com.rushedstudio.domino.api.model.list;

import com.rushedstudio.domino.api.model.dto.UserAddressDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserAddressListDTO {

    private List<UserAddressDTO> userAddressDTOList;
}
