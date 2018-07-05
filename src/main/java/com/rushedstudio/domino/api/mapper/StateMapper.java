package com.rushedstudio.domino.api.mapper;

import com.rushedstudio.domino.api.model.dto.StateDTO;
import com.rushedstudio.domino.domain.State;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {
        UserMapper.class,
        RoleMapper.class,
        AccountMapper.class,
        AddressMapper.class,
        CityMapper.class,
        CountryMapper.class,
        LocationMapper.class,
//        StateMapper.class,
        UserAddressMapper.class
})
public interface StateMapper {

    StateMapper INSTANCE = Mappers.getMapper(StateMapper.class);

    StateDTO toStateDTO(State state);

    State toState(StateDTO stateDTO);

    List<StateDTO> toStateDTOList(List<State> stateList);

    List<State> toStateList(List<StateDTO> stateDTOList);

}
