package com.iam.gesconsspring.web;

import com.iam.gesconsspring.dao.ProjetRepository;
import com.iam.gesconsspring.entities.Projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjetRestService {
    @Autowired
    private ProjetRepository projetRepository;

    @GetMapping(value = "/listProjets")
    public List<Projet> listProjet() {
        return projetRepository.findAll();
    }

    @GetMapping(value = "/listProjets/{id}")
    public Projet getProjet(@PathVariable(name = "id") Long id) {
        return projetRepository.findById(id).get();
    }

    @PostMapping(value = "/listProjets")
    public Projet save(@RequestBody Projet projet) {
        return projetRepository.save(projet);
    }

    @PutMapping(value = "/listProjets/{id}")
    public Projet update(@PathVariable(name = "id") Long id, @RequestBody Projet projet) {
        projet.setId(id);
        return projetRepository.save(projet);
    }

    @DeleteMapping(value = "/listProjets/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        projetRepository.deleteById(id);
    }
}
