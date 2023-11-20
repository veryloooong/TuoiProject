package server.repository;


import org.springframework.stereotype.Repository;
import server.data.User;

@Repository
public class UserRepository implements IUserRepo{
    @Override
    public User findUserByUserAccount(String userAccount) {
        return null;
    }
}
