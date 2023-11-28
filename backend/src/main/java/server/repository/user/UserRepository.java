package server.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.data.pojo.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    public User findUserById(long UserId);
    public User save(User user);
    public User update( User user);
    public void delete(User user);
    public List<User> findAll();
}
