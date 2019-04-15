package com.marom.jwtauthentication.repository;

import com.marom.jwtauthentication.domain.Role;
import com.marom.jwtauthentication.domain.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName roleName);
}
