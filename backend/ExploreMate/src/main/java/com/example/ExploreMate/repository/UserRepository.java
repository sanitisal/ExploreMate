package com.example.ExploreMate.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ExploreMate.beans.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByEmailId(String email);

}
