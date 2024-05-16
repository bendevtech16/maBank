package services;

import dtos.UserDTO;
import entity.User;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mappers.UserMapper;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Transactional
@Service
@Slf4j
public class UserServiceImpl implements UserServiceInterface {
    private UserRepository userRepository;
    private UserMapper userMapper;


    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        log.info("saving new User ...");
        User user = userMapper.fromUserDTO(userDTO);
        User userSave = userRepository.save(user);
        return userMapper.fromUser(userSave);
    }
    public List<UserDTO> findAll() {
        List<User> users = userRepository.findAll();
        List<UserDTO> userDTOS = new ArrayList<>();
        for (User user : users) {
        userDTOS.add(userMapper.fromUser(user));
        }
        return  userDTOS;
    }
}
