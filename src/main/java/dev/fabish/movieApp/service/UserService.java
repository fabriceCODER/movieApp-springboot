package dev.fabish.movieApp.service;

import dev.fabish.movieApp.entity.User;
import dev.fabish.movieApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public User registerUser(String username, String password, String role) {
        if (userRepository.findByUsername(username) != null) {
            throw new RuntimeException("Username is already taken");
        }

        String encryptedPassword = passwordEncoder.encode(password);

        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(encryptedPassword);
        newUser.setRole(role); // Set role (e.g., "USER" or "ADMIN")

        return userRepository.save(newUser);
    }
}

