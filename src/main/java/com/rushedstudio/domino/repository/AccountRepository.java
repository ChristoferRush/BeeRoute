package com.rushedstudio.domino.repository;

import com.rushedstudio.domino.domain.Account;
import com.rushedstudio.domino.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByName(String name);

    Account findByUser(User user);

    Account findByUserId(Long userId);
}
