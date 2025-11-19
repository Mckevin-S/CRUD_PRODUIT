package EADL.CRUD_PRODUIT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import EADL.CRUD_PRODUIT.entity.Produit;

public interface ProductRepository extends JpaRepository<Produit, Long>{

}
