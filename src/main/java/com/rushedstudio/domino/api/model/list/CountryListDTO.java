package com.rushedstudio.domino.api.model.list;

import com.rushedstudio.domino.api.model.dto.CountryDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CountryListDTO {

    private List<CountryDTO> countries;
}
