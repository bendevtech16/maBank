package entity;

import jakarta.persistence.DiscriminatorValue;
import lombok.*;

@DiscriminatorValue("CC")
@AllArgsConstructor @NoArgsConstructor @ToString @Builder @Data
public class CompteCourant extends Compte{
    private double decouvertAutorise;


}
