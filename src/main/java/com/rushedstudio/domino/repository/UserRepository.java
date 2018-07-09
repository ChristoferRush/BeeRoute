package com.rushedstudio.domino.repository;

import com.rushedstudio.domino.domain.Account;
import com.rushedstudio.domino.domain.Role;
import com.rushedstudio.domino.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByFirstName(String firstName);

    List<User> findAllByLastName(String lastName);

    List<User> findAllByRole(Role role);

    List<User> findAllByRoleId(Long roleId);

    User findByEmail(String email);

    User findByAccount(Account account);

    User findByAccountId(Long accountId);
}
