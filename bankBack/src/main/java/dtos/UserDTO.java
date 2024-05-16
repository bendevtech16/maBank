package dtos;

import lombok.*;

@Data
@AllArgsConstructor @NoArgsConstructor @ToString @Builder
public class UserDTO {
    private long userId;
    private String userName;
    private String userEmail;
    private String userAdress;
}
