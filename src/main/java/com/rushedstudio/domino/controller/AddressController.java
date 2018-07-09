package com.rushedstudio.domino.controller;

import com.rushedstudio.domino.api.model.AddressDto;
import com.rushedstudio.domino.api.model.CityDto;
import com.rushedstudio.domino.api.model.LocationDto;
import com.rushedstudio.domino.api.model.UserAddressDto;
import com.rushedstudio.domino.service.impl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(AddressController.BASE_URL)
public class AddressController {

    static final String BASE_URL = "/address";

    private AddressServiceImpl addressService;

    @Autowired
    public AddressController(AddressServiceImpl addressService) {
        this.addressService = addressService;
    }

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    public List<AddressDto> getAllAddresses(){
        return addressService.getAllAddresses();
    }

    @GetMapping(value = "/str:{streetAddress}")
    @ResponseStatus(HttpStatus.OK)
    public List<AddressDto> getAllAddressesByStreetAddress(@PathVariable String streetAddress){
        return addressService.getAllAddressesByStreetAddress(streetAddress);
    }

    @GetMapping(value = "/homeNumber:{homeNumber}")
    @ResponseStatus(HttpStatus.OK)
    public List<AddressDto> getAllAddressesByHomeNumber(@PathVariable String homeNumber){
        return addressService.getAllAddressesByHomeNumber(homeNumber);
    }

    @GetMapping(value = "/homeNumber:{homeNumber}/flat:{flatNumber}")
    @ResponseStatus(HttpStatus.OK)
    public List<AddressDto> getAllAddressesByHomeNumberAndFlatNumber(@PathVariable String homeNumber,
                                                                     @PathVariable String flatNumber){
        return addressService.getAllAddressesByHomeNumberAndFlatNumber(homeNumber, flatNumber);
    }

    @GetMapping(value = "/city:{cityDto}")
    @ResponseStatus(HttpStatus.OK)
    public List<AddressDto> getAllAddressesByCity(@PathVariable CityDto cityDto){
        return addressService.getAllAddressesByCity(cityDto);
    }

    @GetMapping(value = "/id:{id}")
    @ResponseStatus(HttpStatus.OK)
    public AddressDto getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

    @GetMapping(value = "/location:{locationDto}")
    @ResponseStatus(HttpStatus.OK)
    public AddressDto getAddressByLocation(@PathVariable LocationDto locationDto){
        return addressService.getAddressByLocation(locationDto);
    }

    @GetMapping(value = "/userAddress:{userAddressDto}")
    @ResponseStatus(HttpStatus.OK)
    public AddressDto getAddressByUserAddress(@PathVariable UserAddressDto userAddressDto){
        return addressService.getAddressByUserAddress(userAddressDto);
    }
}
