package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.StateDto;
import com.rushedstudio.domino.domain.State;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StateMapper {

    StateMapper INSTANCE = Mappers.getMapper(StateMapper.class);

    StateDto toStateDTO(State state);

    State toState(StateDto stateDto);

    List<StateDto> toStateDTOList(List<State> stateList);

    List<State> toStateList(List<StateDto> stateDtoList);

}
