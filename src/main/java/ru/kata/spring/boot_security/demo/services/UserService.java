package ru.kata.spring.boot_security.demo.services;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;
import java.util.Set;

public interface UserService extends UserDetailsService {
    void saveUser(User user);

    List<User> findAll();

    User findUser(Long id);

    void updateUser(Long id, User user);

    void deleteUser(Long id);

    User findByUsername(String username);
    List<Role> getRoles();

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
