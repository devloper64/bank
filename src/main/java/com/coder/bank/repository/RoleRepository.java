package com.coder.bank.repository;

import com.coder.bank.model.Role;
import com.coder.bank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<User> findByUserName(String username);
    Boolean exitsByUserName(String username);
    Boolean exitsByEmail(String email);

}
