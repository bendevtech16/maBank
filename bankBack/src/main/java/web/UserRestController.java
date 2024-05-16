package web;

import dtos.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import services.UserServiceImpl;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserRestController {
    private UserServiceImpl userService;

    @PostMapping("/save")
    public UserDTO handleSaveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @GetMapping("userList")
    public List<UserDTO> findAllUser(){
        return userService.findAll();
    }

}
