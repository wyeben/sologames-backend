package com.sologamesbackend.sologamesbackend.repositories.UserRepository;

import com.sologamesbackend.sologamesbackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
