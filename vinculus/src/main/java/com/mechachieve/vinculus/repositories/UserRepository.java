package com.mechachieve.vinculus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.mechachieve.vinculus.user.User;

public interface UserRepository extends JpaRepository<User, String> {

	UserDetails findByLogin(String login);
}
