package mappers;

import com.fasterxml.jackson.databind.util.BeanUtil;
import dtos.UserDTO;
import entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {
    /**
     * recupere un user et renvoie un userDTO
     * @param user le paramettre a recuperer
     * @return returne un DTO
     */
    public UserDTO fromUser( User user){
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        return  userDTO;
    }

    /**
     * prend en paramettre un userDTO
     * @param userDTO le paramettre a prendre
     * @return renvoie un User.
     */
    public User fromUserDTO(UserDTO userDTO){
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        return user;
    }

}
