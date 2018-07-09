package com.rushedstudio.domino.repository;

import com.rushedstudio.domino.domain.City;
import com.rushedstudio.domino.domain.Country;
import com.rushedstudio.domino.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {

    List<State> findAllByCountry(Country country);

    List<State> findAllByCountryId(Short countryId);

    List<State> findAllByCountryName(String countryName);

    State findByName(String name);

    State findByCityListIsContaining(City city);
}
