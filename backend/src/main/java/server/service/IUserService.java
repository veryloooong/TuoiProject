package server.service;

import server.data.pojo.User;

public interface IUserService {
    User create(User user);

    User update(User user);

    void delete(User user);

    User findById(Long userId);
}
