package com.server.user.service.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.server.user.service.domain.dto.UserRequest;
import com.server.user.service.domain.dto.UserResponse;
import com.server.user.service.domain.entity.User;
import com.server.user.service.repository.UserRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<UserResponse> getAllUsers() {
        List<User> users = userRepository.findAll();

        return users.stream()
                .map(this::mapToUserResponse)
                .collect(Collectors.toList());
    }

    public UserResponse getUserById(Integer id) {
        return userRepository.findById(id)
                .map(this::mapToUserResponse)
                .orElseThrow(() -> new IllegalArgumentException("Kullanıcı Bulunamadı: " + id));
    }

    public UserResponse create(UserRequest userRequest) {
        User user = new User(
                userRequest.id(),
                userRequest.name(),
                userRequest.email(),
                userRequest.password());

        User createdUser = userRepository.save(user);

        return mapToUserResponse(createdUser);
    }

    public UserResponse update(Integer id, UserRequest userRequest) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Kullanıcı bulunamadı: " + id));

        user.setName(userRequest.name());
        user.setEmail(userRequest.email());

        User updatedUser = userRepository.save(user);

        return mapToUserResponse(updatedUser);
    }

    public void delete(Integer id) {
        User user = userRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Kullanıcı bulunamadı: " + id));

        userRepository.deleteById(user.getId());
    }

    private UserResponse mapToUserResponse(User user) {
        return new UserResponse(
                user.getId(),
                user.getName(),
                user.getEmail());
    }
}
