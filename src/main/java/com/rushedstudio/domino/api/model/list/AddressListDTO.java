package com.rushedstudio.domino.api.model.list;

import com.rushedstudio.domino.api.model.dto.AddressDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class AddressListDTO {

    private List<AddressDTO> addressDTOList;
}
