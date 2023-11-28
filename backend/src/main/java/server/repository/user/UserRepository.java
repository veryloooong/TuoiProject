package server.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.data.User;
import server.data.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    public User findUserById(long UserId);
    public User save();
    public User update();
    public User delete();
    public List<User> findAll();
}
