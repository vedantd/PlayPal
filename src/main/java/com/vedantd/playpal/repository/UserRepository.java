package com.vedantd.playpal.repository;

import com.vedantd.playpal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    List<User> findBySkillLevelsContains(String skillLevel);
    List<User> findByAddressCity(String city);

}