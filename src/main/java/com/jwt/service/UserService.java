package com.jwt.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Logic to get user from database
        return new User("admin", "$2a$10$gjoB9R9P0S7m/0Wv2od6VeV2JGc2Sw4qEhiMWK8McKbb4Vwmf/3hC",
                new ArrayList<>());
    }
}
