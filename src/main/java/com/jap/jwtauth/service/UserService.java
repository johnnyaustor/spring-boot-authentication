package com.jap.jwtauth.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jap.jwtauth.db.entity.User;
import com.jap.jwtauth.db.repository.UserRepository;
import com.jap.jwtauth.dto.request.UserRequest;
import com.jap.jwtauth.dto.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author jap
 */

@Service
public class UserService {
    private final UserRepository userRepository;
    private final ObjectMapper objectMapper;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, ObjectMapper objectMapper, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.objectMapper = objectMapper;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public UserResponse register(UserRequest userRequest) {
        userRequest.setPassword(bCryptPasswordEncoder.encode(userRequest.getPassword()));
        User user = objectMapper.convertValue(userRequest, User.class);
        User save = userRepository.save(user);

        return objectMapper.convertValue(save, UserResponse.class);
    }

    public UserResponse findByUsername(String username) {
        User user = userRepository.findByUsername(username);
        if (user == null) throw new UsernameNotFoundException("User not found");
        return objectMapper.convertValue(user, UserResponse.class);
    }

}
