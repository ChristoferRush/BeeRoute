package com.rushedstudio.domino.service.impl;

import com.rushedstudio.domino.api.mapper.CityMapper;
import com.rushedstudio.domino.api.mapper.CountryMapper;
import com.rushedstudio.domino.api.mapper.StateMapper;
import com.rushedstudio.domino.api.model.CityDto;
import com.rushedstudio.domino.api.model.CountryDto;
import com.rushedstudio.domino.api.model.StateDto;
import com.rushedstudio.domino.domain.City;
import com.rushedstudio.domino.repository.StateRepository;
import com.rushedstudio.domino.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServiceImpl implements StateService {

    private StateRepository stateRepository;

    @Autowired
    public StateServiceImpl(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    @Override
    public List<StateDto> getAllStates() {
        return StateMapper.INSTANCE.toStateDTOList(stateRepository.findAll());
    }

    @Override
    public List<StateDto> getAllStatesByCountry(CountryDto countryDto) {
        return StateMapper.INSTANCE.toStateDTOList(stateRepository.findAllByCountry(
                CountryMapper.INSTANCE.toCountry(countryDto)));
    }

    @Override
    public List<StateDto> getAllStatesByCountryId(Short countryId) {
        return StateMapper.INSTANCE.toStateDTOList(stateRepository.findAllByCountryId(countryId));
    }

    @Override
    public List<StateDto> getAllStatesByCountryName(String countryName) {
        return StateMapper.INSTANCE.toStateDTOList(stateRepository.findAllByCountryName(countryName));
    }

    @Override
    public StateDto getStateById(Long id) {
        return StateMapper.INSTANCE.toStateDTO(stateRepository.getOne(id));
    }

    @Override
    public StateDto getStateByName(String name) {
        return StateMapper.INSTANCE.toStateDTO(stateRepository.findByName(name));
    }

    @Override
    public StateDto getStateByCity(CityDto cityDto) {
        return StateMapper.INSTANCE.toStateDTO(stateRepository.findByCityListIsContaining(
                CityMapper.INSTANCE.toCity(cityDto)));
    }
}
