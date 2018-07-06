package com.rushedstudio.domino.service;

import com.rushedstudio.domino.api.model.StateDto;

import java.util.List;

public interface StateService {

    List<StateDto> getAllStates();

    StateDto getStateById(Long id);
}
