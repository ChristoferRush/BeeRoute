package com.rushedstudio.domino.api.model.list;

import com.rushedstudio.domino.api.model.dto.CityDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CityListDTO {

    private List<CityDTO> cities;
}
