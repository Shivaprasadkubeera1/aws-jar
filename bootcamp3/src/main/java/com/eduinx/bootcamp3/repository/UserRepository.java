package com.eduinx.bootcamp3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduinx.bootcamp3.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}