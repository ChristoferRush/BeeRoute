package com.rushedstudio.domino.api.model.list;

import com.rushedstudio.domino.api.model.dto.RoleDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleListDTO {

    private List<RoleDTO> roleDTOList;
}
