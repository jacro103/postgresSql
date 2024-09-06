package com.example.postgresSql.data.repository;

import com.example.postgresSql.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {
}
