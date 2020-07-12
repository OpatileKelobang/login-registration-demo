package za.co.bogote.loginregistrationdemo.service;

import org.springframework.stereotype.Service;
import za.co.bogote.loginregistrationdemo.model.Role;
import za.co.bogote.loginregistrationdemo.model.User;
import za.co.bogote.loginregistrationdemo.repository.UserRepository;
import za.co.bogote.loginregistrationdemo.web.dto.UserRegistrationDTO;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDTO registrationDTO) {

        User user = new User(
                registrationDTO.getFirstName(),
                registrationDTO.getLastName(),
                registrationDTO.getEmail(),
                registrationDTO.getPassword(),
                Arrays.asList(new Role("ROLE_USER"))
        );

        return userRepository.save(user);
    }
}
