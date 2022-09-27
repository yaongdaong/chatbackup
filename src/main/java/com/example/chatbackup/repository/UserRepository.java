package com.example.chatbackup.repository;

import com.example.chatbackup.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}