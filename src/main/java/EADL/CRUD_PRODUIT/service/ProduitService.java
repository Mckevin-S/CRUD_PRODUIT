package EADL.CRUD_PRODUIT.service;

import java.util.List;

import org.springframework.stereotype.Service;

import EADL.CRUD_PRODUIT.entity.Produit;
import EADL.CRUD_PRODUIT.repository.ProduitRepositorr;

@Service
public class ProduitService { 
    
    private final ProduitRepositorr repo;

    public ProduitService(ProduitRepositorr repo) {
        this.repo = repo;
    }

    public List<Produit> findAll() {
        return repo.findAll();
    }

    public Produit findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Produit save(Produit produit) {
        return repo.save(produit);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
