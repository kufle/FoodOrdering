package my.id.irawandev.foodorder.repositories;

import my.id.irawandev.foodorder.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByEmail(String email);
}
