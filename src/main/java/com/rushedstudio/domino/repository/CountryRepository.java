package com.rushedstudio.domino.repository;

import com.rushedstudio.domino.domain.Country;
import com.rushedstudio.domino.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Short> {

    Country findByName(String countryName);

    Country findByCode(String countryCode);

    Country findByIso(String countryIso);
}
