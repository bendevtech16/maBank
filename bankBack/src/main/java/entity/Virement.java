package entity;

import enums.VirementStatut;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("VIREMENT")
@AllArgsConstructor @NoArgsConstructor @Data
 @ToString @Builder
public class Virement extends Operation{
    private Compte compteDestination;
    private String description;
    private VirementStatut statutVirement;

}
