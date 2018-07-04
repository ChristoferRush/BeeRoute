package com.rushedstudio.domino.api.model.list;

import com.rushedstudio.domino.api.model.dto.StateDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class StateListDTO {

    private List<StateDTO> states;
}
