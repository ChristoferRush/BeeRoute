package com.rushedstudio.domino.repository;

import com.rushedstudio.domino.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
