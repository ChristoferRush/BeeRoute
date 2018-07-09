package com.rushedstudio.domino.repository;

import com.rushedstudio.domino.domain.Address;
import com.rushedstudio.domino.domain.City;
import com.rushedstudio.domino.domain.Location;
import com.rushedstudio.domino.domain.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    List<Address> findAllByStreetAddress(String streetAddress);

    List<Address> findAllByHomeNumber(String homeNumber);

    List<Address> findAllByHomeNumberAndFlatNumber(String homeNumber, String flatNumber);

    List<Address> findAllByCity(City city);

    Address findByLocation(Location location);

    Address findByUserAddressListIsContaining(UserAddress userAddress);
}
