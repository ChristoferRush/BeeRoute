package com.rushedstudio.domino.service.impl;

import com.rushedstudio.domino.api.mapper.StateMapper;
import com.rushedstudio.domino.api.model.StateDto;
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
    public StateDto getStateById(Long id) {
        return StateMapper.INSTANCE.toStateDTO(stateRepository.getOne(id));
    }
}
