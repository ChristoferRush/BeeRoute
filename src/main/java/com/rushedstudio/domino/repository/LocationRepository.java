package com.rushedstudio.domino.repository;

import com.rushedstudio.domino.domain.Address;
import com.rushedstudio.domino.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

    Location findByAddress(Address address);
}
