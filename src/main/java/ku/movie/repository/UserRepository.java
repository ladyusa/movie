package ku.movie.repository;

import ku.movie.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    // SELECT * FROM User WHERE username = ‘username’
    User findByUsername(String username);

}
