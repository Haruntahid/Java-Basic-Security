package com.Security.BasicSecurity.repository;

import com.Security.BasicSecurity.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
