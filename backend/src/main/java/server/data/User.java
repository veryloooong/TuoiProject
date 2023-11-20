package server.data;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class User {
    private String account;
    private String password;
    private String matchingPassword;
    private String email;
    private String userAvatar;
    private String authority;
    private String token;
}
