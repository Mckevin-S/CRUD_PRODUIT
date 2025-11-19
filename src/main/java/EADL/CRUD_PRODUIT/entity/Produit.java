package EADL.CRUD_PRODUIT.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    private Double prix;
}

