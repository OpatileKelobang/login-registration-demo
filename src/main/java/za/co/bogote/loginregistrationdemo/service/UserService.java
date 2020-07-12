package za.co.bogote.loginregistrationdemo.service;

import za.co.bogote.loginregistrationdemo.model.User;
import za.co.bogote.loginregistrationdemo.web.dto.UserRegistrationDTO;

public interface UserService {
    User save(UserRegistrationDTO registrationDTO);
}
