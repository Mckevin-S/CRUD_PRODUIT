package EADL.CRUD_PRODUIT.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import EADL.CRUD_PRODUIT.entity.Produit;
import EADL.CRUD_PRODUIT.service.ProduitService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/produits")
@AllArgsConstructor
public class ProduitController {

    private final ProduitService service;

    @Operation(summary = "Lister tous les produits")
    @GetMapping
    public List<Produit> getAll(){
        return service.findAll();
    }

    @Operation(summary = "Creer un produit")
    @PostMapping
    public Produit create(@RequestBody Produit produit){
        return service.save(produit);
    }

    @Operation(summary = "Modifier un produit")
    @PutMapping("/{id}")
    public Produit update(@PathVariable Long id, @RequestBody Produit produit) {
        produit.setId(id);
        return service.save(produit);
    }

    @Operation(summary = "Supprimer un produit")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    
}
