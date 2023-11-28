package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.data.pojo.User;
import server.repository.user.UserRepository;
@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User create(User user){
        return userRepository.save(user);
    }
    @Override
    public User update(User user){
        return userRepository.update(user);
    }
    @Override
    public void delete(User user){
         userRepository.delete(user);
    }
    @Override
    public User findById(Long userId){
        return userRepository.findUserById(userId);
    }
}
