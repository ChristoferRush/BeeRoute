package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.dto.StateDTO;
import com.rushedstudio.domino.domain.State;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StateMapper {

    StateMapper INSTANCE = Mappers.getMapper(StateMapper.class);

    StateDTO stateToStateDTO(State state);

    State stateDTOToState(StateDTO stateDTO);

    List<StateDTO> stateListToStateDTOList(List<State> stateList);

    List<State> stateDTOListToStateList(List<StateDTO> stateDTOList);

}
