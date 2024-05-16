package entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("RETRAIT")
@AllArgsConstructor @NoArgsConstructor
@Data @ToString @Builder

public class Retrait extends  Operation{
private int motifRetrait ;
}
