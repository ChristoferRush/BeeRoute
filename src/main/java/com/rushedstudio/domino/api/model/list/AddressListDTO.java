package com.rushedstudio.domino.api.model.list;

import com.rushedstudio.domino.api.model.dto.AddressDTO;
import lombok.Data;

import java.util.List;

@Data
public class AddressListDTO {

    private List<AddressDTO> addressDTOList;
}
