package entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import enums.CompteStatut;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE", length = 4)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Compte {
    @Id
    private String compteId;
    @ManyToOne
    private User user;
    @Enumerated(EnumType.STRING)
    private CompteStatut statutCompte;
    private double soldeCompte;
    private LocalDate dateCreation;
    @OneToMany(mappedBy = "compte", fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private List<Operation> operations;
}
