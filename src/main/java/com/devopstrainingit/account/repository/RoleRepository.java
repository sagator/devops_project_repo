package com.devopstrainingit.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devopstrainingit.account.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
