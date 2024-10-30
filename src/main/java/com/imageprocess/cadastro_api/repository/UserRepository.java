package com.imageprocess.cadastro_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imageprocess.cadastro_api.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
