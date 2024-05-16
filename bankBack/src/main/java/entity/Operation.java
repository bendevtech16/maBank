package entity;

import enums.StatutOperation;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_OPERATION", length = 10)
@AllArgsConstructor @NoArgsConstructor
@Data @ToString

public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private long operationId;
private LocalDate dateOperation;
@ManyToOne
private Compte compte;
@Enumerated(EnumType.STRING)
private StatutOperation operation;
private  double montantOperation;

}
