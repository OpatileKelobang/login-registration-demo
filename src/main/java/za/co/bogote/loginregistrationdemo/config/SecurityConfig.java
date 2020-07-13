package za.co.bogote.loginregistrationdemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class SecurityConfig {
    @Autowired
    private Environment environment;

    private static final String[] PUBLIC_MATCHERS = {
            "/css/**",
            "/js/**",
            "/",
            "registration.html"
    };
}
