package com.rushedstudio.domino.controller;

import com.rushedstudio.domino.api.model.AddressDto;
import com.rushedstudio.domino.api.model.UserAddressDto;
import com.rushedstudio.domino.api.model.UserDto;
import com.rushedstudio.domino.service.impl.UserAddressServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(UserAddressController.BASE_URL)
public class UserAddressController {

    static final String BASE_URL = "/useraddress";

    private UserAddressServiceImpl userAddressService;

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    public List<UserAddressDto> getAllUserAddresses(){
        return userAddressService.getAllUserAddresses();
    }

    @GetMapping(value = "/user:{userDto}")
    @ResponseStatus(HttpStatus.OK)
    public List<UserAddressDto> getAllUserAddressesByUser(@PathVariable UserDto userDto){
        return userAddressService.getAllUserAddressesByUser(userDto);
    }

    @GetMapping(value = "/address:{addressDto}")
    @ResponseStatus(HttpStatus.OK)
    public List<UserAddressDto> getAllUserAddressesByAddress(@PathVariable AddressDto addressDto){
        return userAddressService.getAllUserAddressesByAddress(addressDto);
    }

    @GetMapping(value = "/main:{main}")
    @ResponseStatus(HttpStatus.OK)
    public List<UserAddressDto> getAllUserAddressesByMain(@PathVariable boolean main){
        return userAddressService.getAllUserAddressesByMain(main);
    }

    @GetMapping(value = "/id:{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserAddressDto getUserAddressById(@PathVariable Long id){
        return userAddressService.getUserAddressById(id);
    }
}
