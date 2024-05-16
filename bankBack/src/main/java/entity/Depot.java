package entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("DEPOT")
@Data @ToString @Builder
@AllArgsConstructor @NoArgsConstructor
public class Depot extends  Operation{
private  int motifDepot;
}
