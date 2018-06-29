package com.rushedstudio.domino.exception;

import com.rushedstudio.domino.domain.Permission;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RoleNotFoundException extends RuntimeException {

    public RoleNotFoundException(Long id){
        super("Could not find role " + id);
    }

    public RoleNotFoundException(String name){
        super("Could not find role with name " + name);
    }

    public RoleNotFoundException(Permission permission){
        super("Could not find role with permission " + permission.toString());
    }
}
