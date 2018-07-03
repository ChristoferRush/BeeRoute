package com.rushedstudio.domino.api.model.list;

import com.rushedstudio.domino.api.model.dto.StateDTO;
import lombok.Data;

import java.util.List;

@Data
public class StateListDTO {

    private List<StateDTO> states;
}
