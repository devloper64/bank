package com.coder.bank.repository;

import java.util.Optional;

import com.coder.bank.model.Role;
import com.coder.bank.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
