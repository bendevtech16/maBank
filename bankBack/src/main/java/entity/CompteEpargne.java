package entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@DiscriminatorValue("CE")
@Entity @AllArgsConstructor @NoArgsConstructor @Data @ToString @Builder

public class CompteEpargne  extends Compte{
    private double tauxInteret;
}
