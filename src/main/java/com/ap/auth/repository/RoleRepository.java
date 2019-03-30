package com.ap.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ap.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
