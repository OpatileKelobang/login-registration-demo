package za.co.bogote.loginregistrationdemo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import za.co.bogote.loginregistrationdemo.model.User;
import za.co.bogote.loginregistrationdemo.web.dto.UserRegistrationDTO;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDTO registrationDTO);
}
