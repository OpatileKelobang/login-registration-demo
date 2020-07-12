package za.co.bogote.loginregistrationdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.bogote.loginregistrationdemo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
