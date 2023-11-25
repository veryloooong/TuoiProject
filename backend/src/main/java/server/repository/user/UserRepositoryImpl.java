package server.repository.user;

import org.springframework.stereotype.Repository;
import server.data.User;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User createUser(String name, String email) {
        return new User(name, email);
    }

    @Override
    public User findUserByUsername(String username) {
        return new User(username, "a@example.com");
    }

    @Override
    public User findUserById(long userId) {
        // truy vấn từ DB

        return null;
    }

    @Override
    public void updateUserUsername(long id, String newUsername) {
        return;
    }

    @Override
    public void updateUserEmail(long id, String newEmail) {
        return;
    }

    @Override
    public void removeUser(long id) {
        return;
    }
}
