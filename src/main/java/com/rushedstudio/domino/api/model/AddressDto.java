package com.rushedstudio.domino.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
public class AddressDto {

    private Long id;
    private String streetAddress;
    private String homeNumber;
    private String flatNumber;
    private String postalCode;
    private LocationDto location;
    @JsonIgnoreProperties({"addressList"})
    private CityDto city;
    private List<UserAddressDto> userAddressList;
}
