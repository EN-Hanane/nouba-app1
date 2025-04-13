package com.orange.noubaapp1.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client extends User {

    private String telephone;

    @ManyToOne
    @JoinColumn(name = "ville_id")
    private Ville ville;
}
