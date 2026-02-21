package com.jb.ninth_spring_boot_app.Security.JwtTokenGen;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jb.ninth_spring_boot_app.Security.Users.StudentUser;
import com.jb.ninth_spring_boot_app.Security.Users.StudentUserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private StudentUserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String email) {
        StudentUser user = repository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return new User(user.getEmail(), user.getPassword(), new ArrayList<>());
    }
}

