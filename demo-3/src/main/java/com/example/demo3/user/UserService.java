package com.example.demo3.user;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    public final UserRepository userRepository;

    public SiteUser create(String username, String password) {
        SiteUser user = new SiteUser();
        user.setUsername(username);
        user.setPassword(password);
        this.userRepository.save(user);
        return user;
    }


}
