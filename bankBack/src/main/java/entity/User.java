package entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity @AllArgsConstructor @NoArgsConstructor @Builder @ToString @Data

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String userName;
    private String userEmail;
    private String userAdress;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private List<Compte> comptes;

}
