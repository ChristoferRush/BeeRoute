package com.rushedstudio.domino.api.model.list;

import com.rushedstudio.domino.api.model.dto.CityDTO;
import lombok.Data;

import java.util.List;

@Data
public class CityListDTO {

    private List<CityDTO> cityDTOList;
}
