package com.jap.jwtauth.service;

import com.jap.jwtauth.db.entity.User;
import com.jap.jwtauth.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public CustomUserDetailsService(UserRepository usersRepository) {
        this.userRepository = usersRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) throw new UsernameNotFoundException("User not found");

        return user;
    }

    @Transactional
    public User loadUserById(Long id) {
        User user = userRepository.findById(id).orElse(null);
        if (user == null) throw new UsernameNotFoundException("User not found");

        return user;
    }
}
