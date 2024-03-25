package service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String login(Integer id, String name) {
        if (id == 1 && name.equals("王天赐")) {
            return "登录成功";
        } else {
            return "登录失败";
        }
    }
}
