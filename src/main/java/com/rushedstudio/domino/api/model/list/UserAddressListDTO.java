package com.rushedstudio.domino.api.model.list;

import com.rushedstudio.domino.api.model.dto.UserAddressDTO;
import lombok.Data;

import java.util.List;

@Data
public class UserAddressListDTO {

    private List<UserAddressDTO> userAddressDTOList;
}
