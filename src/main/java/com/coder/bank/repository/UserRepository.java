package com.coder.bank.repository;

import com.coder.bank.model.Role;
import com.coder.bank.model.RoleName;
import com.coder.bank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
 Optional<Role> findByName(RoleName roleName);
}
