package dev.fabish.movieApp.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Replace with logic to fetch user from database
        if ("user".equals(username)) {
            return new User("user", "{noop}password", new ArrayList<>());
        }
        throw new UsernameNotFoundException("User not found");
    }
}

