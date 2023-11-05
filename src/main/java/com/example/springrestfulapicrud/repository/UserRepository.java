package com.example.springrestfulapicrud.repository;

import com.example.springrestfulapicrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
