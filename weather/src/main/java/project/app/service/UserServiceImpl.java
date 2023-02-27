package project.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import project.app.model.dto.UserRegDto;
import project.app.model.entity.User;
import project.app.repository.UserRepository;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public String register(UserRegDto userRegDto) {
        User user = userRepository.findByUsername(userRegDto.getUsername());
        if (user == null){

        }
    }
}
