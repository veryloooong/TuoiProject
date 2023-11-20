package server.repository;


import server.data.User;

public interface IUserRepo {
    User findUserByUserAccount(String userAccount);
}
