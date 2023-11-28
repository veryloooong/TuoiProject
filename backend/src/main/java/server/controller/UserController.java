package server.controller;

import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.data.pojo.User;
import server.service.IUserService;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @PostMapping("/create")
    public ResponseEntity<User> create (@RequestBody User userRequest){
        User user = userService.create(userRequest);
        return ResponseEntity.ok(user);
    }
    @PostMapping("/create")
    public ResponseEntity<User> update (@RequestBody User userRequest){
        User user = userService.update(userRequest);
        return ResponseEntity.ok(user);
    }
    @PostMapping("/create")
    public ResponseEntity<String> delete (@RequestBody User userRequest){
        userService.delete(userRequest);
        return ResponseEntity.ok("Delete Success!!!");
    }
    @PostMapping("/create")
    public ResponseEntity<User> findUserById (@RequestBody Long userId){
        User user = userService.findById(userId);
        return ResponseEntity.ok(user);
    }
}
