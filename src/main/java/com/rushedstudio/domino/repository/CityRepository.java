package com.rushedstudio.domino.repository;

import com.rushedstudio.domino.domain.Address;
import com.rushedstudio.domino.domain.City;
import com.rushedstudio.domino.domain.Country;
import com.rushedstudio.domino.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

    City findByName(String name);

    List<City> findAllByCountry(Country country);

    List<City> findAllByCountryId(Short countryId);

    List<City> findAllByState(State state);

    List<City> findAllByStateId(Long stateId);

    City findByAddressListIsContaining(Address address);
}
