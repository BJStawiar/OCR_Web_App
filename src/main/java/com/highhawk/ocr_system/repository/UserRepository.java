package com.highhawk.ocr_system.repository;

import com.highhawk.ocr_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
