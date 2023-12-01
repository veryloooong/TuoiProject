package server.service.user;

import java.util.Optional;

import server.data.User;

public interface IUserService {
  // create
  User create(User user);
  
  // read
  Optional<User> findUserById(Long id);

  // update
  User update(Long userId, User newUser);
  
  // TODO: update when new
  User changePassword(Long userId);
  
  // delete
  void delete(Long userId);
}
