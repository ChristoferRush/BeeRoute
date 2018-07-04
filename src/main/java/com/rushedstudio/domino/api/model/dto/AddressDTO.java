package com.rushedstudio.domino.api.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rushedstudio.domino.api.model.list.UserAddressListDTO;
import lombok.Data;

import java.util.List;

@Data
public class AddressDTO {

    private Long id;
    private String streetAddress;
    private String homeNumber;
    private String flatNumber;
    private String postalCode;
    private LocationDTO location;
    private CityDTO city;
    @JsonIgnore
    private List<UserAddressDTO> userAddressList;
}
