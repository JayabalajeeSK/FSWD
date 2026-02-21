package com.jb.ninth_spring_boot_app.Security.Users;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentUserRepository extends JpaRepository<StudentUser, Long> 
{
    Optional<StudentUser> findByEmail(String email);
}
