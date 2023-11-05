package shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shop.domain.User;
import shop.service.UserService;

import java.util.List;

@RestController  //===>@Controller+@ResponseBody
@RequestMapping(value = "/user")
@CrossOrigin//===>配置跨域，网络请求，允许所有的站点访问
public class UserController {

    @Autowired
    private UserService userService;

    @PutMapping
    public List<User> selectUser(@RequestBody User user) {
        return userService.selectUser(user.getUsername(),user.getPassword());
    }
    @PostMapping
    public boolean insertuser(@RequestBody User user) {
        int i = userService.insertuser(user.getUsername(), user.getPassword());
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    @GetMapping("/{username}")
    public boolean selectisuser(@PathVariable String username){
        if (userService.selectisuser(username).size() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
