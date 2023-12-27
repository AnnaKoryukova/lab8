package koryukova.lab8.service;

import koryukova.lab8.entity.User;
import koryukova.lab8.dto.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO userDto);

    User findUserByEmail(String email);

    List<UserDTO> findAllUsers();
}
